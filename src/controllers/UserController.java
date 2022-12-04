package controllers;

import model.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Vector;
import java.util.ArrayList;

public class UserController {
   
    private DBController onlyInstance;

    public UserController(){
       this.onlyInstance = DBController.getConnection();
    }

    private HashMap<String, String> loginInfos = new HashMap<String, String>();

    private HashMap<String, User> userData = new HashMap<String, User>();

    //this map will be used for validating login info quickly. Use next function for more detailed user info.
    public void pullLoginInfoValidation(){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();
            
            while (rs.next()){
                loginInfos.put(rs.getString("email"), rs.getString("password"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void pullUserInfo(){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                String fName = rs.getString("Fname");
                String lName = rs.getString("Lname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                userData.put(email, new User(fName, lName, email));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //populates array users with all the user infromation in the database
    public void populateUsers(Vector<RegisteredUser> users){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                String fName = rs.getString("Fname");
                String lName = rs.getString("Lname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                users.add(new RegisteredUser(fName, lName, email, password));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // public void populateUserTickets(Vector<RegisteredUser> users, TicketController ticketController){
    //     HashMap<String, ArrayList<Ticket>>tempMap = new HashMap<String, ArrayList<Ticket>>();
    //     for(int i = 0; i < users.size(); i++){
    //         tempMap.put(users.get(i).getEmail(), users.get(i).getTickets());
    //     }
    //     ticketController.populateTickets(tempMap);
    // }

    //returns true if there is a registered user in the data base with this email.
    public boolean verifyEmailAndPassword(String email, String password){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;
        boolean isInDataBase = false;
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();
            //linear search of database to check if a user exists in database
            while (rs.next()){
                if(rs.getString("email") == email){
                    if(rs.getString("password") == password){
                        isInDataBase = true;
                        break;
                    }
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return isInDataBase;
    }
    //vector<string> of user emails for verifying if someone is a user
    //add users to data base based on 
    /*/
    PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("insert into product(productID,description,quantity,price,discount) values(?,?,?,?,?)");
           pstmt.setString(1, productId);
           pstmt.setString(1, desc);
           //same for all statement
           pstmt.executeUpdate();
           pstmt.close();

    */

}
