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


}
