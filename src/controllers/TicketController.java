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
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                if(map.get(rs.getString("Email")) != null){
                    map.get(rs.getString("Email")).add(new Ticket(rs.getInt("TicketID"), rs.getString("Email")
                    , rs.getString("Seats"), rs.getInt("ShowRoom"), 
                    rs.getInt("ShowTime"), rs.getString("ShowDate"), rs.getString("MovieName")));
                }
                else{
                    unRegUsers.add(new UnRegisteredUser("", "", rs.getString("Email")));
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        //DBController.closeConnection();
    }

    public void addTicket(Ticket temp, User user){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;
        try{
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
        //DBController.closeConnection();
    }

    public void removeTicket(String email){
        try{
            String query = "DELETE FROM tickets WHERE Email = ?"; // Creating the query command
            PreparedStatement myStmt = this.onlyInstance.getDBConnection().prepareStatement(query); // Executing the query

            myStmt.setString(1, email);
                        
            myStmt.executeUpdate();   // Excuting the deletion
            
            myStmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //DBController.closeConnection();
    }


}
