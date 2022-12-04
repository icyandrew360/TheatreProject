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

    // public void populateTickets(HashMap<String, ArrayList<Ticket>> map){
    //     String sql = "select * from tickets";
    //     PreparedStatement p = null;
    //     ResultSet rs = null;

    //     try{
    //         p = this.onlyInstance.getDBConnection().prepareStatement(sql);
    //         rs = p.executeQuery();

    //         while (rs.next()){
    //             if(map.get(rs.getString("email")) != null){
    //                 map.get(rs.getString("email")).add(new Ticket(rs.getString("ID"), rs.getString("email")
    //                 , rs.getString("seatNumber"), rs.getString(""), int showTime, String showDate, String movieName));
    //             }
    //         }

    //     }
    //     catch(Exception e){
    //         e.printStackTrace();
    //     }
    // }


}
