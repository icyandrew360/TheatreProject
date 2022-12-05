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
                loginInfos.put(rs.getString("Email"), rs.getString("Password"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //DBController.closeConnection();
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
                String email = rs.getString("Email");
                userData.put(email, new User(fName, lName, email, false));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
       // DBController.closeConnection();
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
                String email = rs.getString("Email");
                String password = rs.getString("Password");
                users.add(new RegisteredUser(fName, lName, email, password));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        //DBController.closeConnection();
    }

    public void populateUserTickets(Vector<UnRegisteredUser> unRegUsers, Vector<RegisteredUser> users, TicketController ticketController){
        HashMap<String, ArrayList<Ticket>>tempMap = new HashMap<String, ArrayList<Ticket>>();
        for(int i = 0; i < users.size(); i++){
            tempMap.put(users.get(i).getEmail(), users.get(i).getTickets());
        }
        ticketController.populateTickets(tempMap, unRegUsers);
    }

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
                if(rs.getString("Email").equals(email)){
                    if(rs.getString("Password").equals(password)){
                        isInDataBase = true;
                        break;
                    }
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        //DBController.closeConnection();
        return isInDataBase;
    }

    public void addUser(String firstName, String lastName, String email, String password){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement("INSERT INTO users(Fname, Lname, Email, Password) VALUES (?, ?, ?, ?)");
            p.setString(1, firstName);
            p.setString(2, lastName);
            p.setString(3, email);
            p.setString(4, password);
            p.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //DBController.closeConnection();
    }
    
    public boolean isValidEmail(String email){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;
        boolean isValid = true;
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();
            //linear search of database to check if a user exists in database
            while (rs.next()){
                if(rs.getString("Email").equals(email)){
                    isValid = false;
                    break;
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return isValid;
    }

}
