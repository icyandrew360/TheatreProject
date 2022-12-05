package controllers;

import model.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Vector;
import java.util.ArrayList;

public class TicketController {
    private DBController onlyInstance;

    public TicketController(){
       this.onlyInstance = DBController.getConnection();
    }

    public void populateTickets(HashMap<String, ArrayList<Ticket>> map, Vector<UnRegisteredUser> unRegUsers){
        String sql = "select * from tickets";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            //get the ticket data into a result set
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //if the email in the database exists in the hashmap, it is a registered user. Add ticket data to that user in the hashmap.
                if(map.get(rs.getString("Email")) != null){
                    map.get(rs.getString("Email")).add(new Ticket(rs.getInt("TicketID"), rs.getString("Email")
                    , rs.getString("Seats"), rs.getInt("ShowRoom"), 
                    rs.getInt("ShowTime"), rs.getString("ShowDate"), rs.getString("MovieName")));
                }
                //if the email in the database is null, it is an unregistered user. add this unregistered user to the unRegUsers vector.
                else{
                    System.out.println(rs.getString("Email"));
                    unRegUsers.add(new UnRegisteredUser("", "", rs.getString("Email")));
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //given ticket data and user, add ticket data to the database
    public void addTicket(Ticket temp, User user){
        //String sql = "select * from users";
        PreparedStatement p = null;
        //ResultSet rs = null;
        try{
            //taking ticket data and inserting a row into ticket database
            p = this.onlyInstance.getDBConnection().prepareStatement("INSERT INTO tickets(Email,TicketID,Seats,ShowTime,ShowRoom, ShowDate, MovieName, Registered) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
            p.setString(1, user.getEmail());
            p.setInt(2, temp.getMovieID());
            p.setString(3, temp.getSeatNumber());
            p.setInt(4, temp.getShowTime());
            p.setInt(5, temp.getShowRoom());
            p.setString(6, temp.getShowDate());
            p.setString(7, temp.getMovieName());
            p.setBoolean(8, user.getIsRegistered());
            p.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void removeTicket(String email){
        try{
            String query = "DELETE FROM tickets WHERE Email = ?"; // Creating the query command
            PreparedStatement myStmt = this.onlyInstance.getDBConnection().prepareStatement(query); //preparing query

            myStmt.setString(1, email);
                        
            myStmt.executeUpdate();   // Excuting the deletion
            
            myStmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


}
