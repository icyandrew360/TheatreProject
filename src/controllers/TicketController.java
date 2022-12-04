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
                if(map.get(rs.getString("email")) != null){
                    map.get(rs.getString("email")).add(new Ticket(rs.getInt("ID"), rs.getString("email")
                    , rs.getString("seatNumber"), rs.getInt("showRoom"), 
                    rs.getInt("showTime"), rs.getString("showDate"), rs.getString("movieName")));
                }
                else{
                    unRegUsers.add(new UnRegisteredUser("", "", rs.getString("email")));
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void addTicket(Ticket temp, User user){
        String sql = "select * from users";
        PreparedStatement p = null;
        ResultSet rs = null;
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement("INSERT INTO tickets(Email,TicketID,Seats,ShowTime,ShowRoom, ShowDate, Mname, IsRegistered) VALUES (?, ?, ?)");
            p.setString(1, temp.getEmail());
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
            PreparedStatement myStmt = this.onlyInstance.getDBConnection().prepareStatement(query); // Executing the query

            myStmt.setString(1, email);
                        
            myStmt.executeUpdate();   // Excuting the deletion
            
            myStmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


}
