package controllers;

import java.sql.*;

public class SeatsController{//these will refer to the singleton DBcontroller
    private DBController database;

    public SeatsController(){
        database = DBController.getConnection();
        // super("temp url that should be changed");
        // super.initializeConnection();
    }

    public void updateSeats(int id, String seats){
        try {
            String query = "UP FROM AVAILABLE_FOOD WHERE ItemID = ?"; // Creating the query command
            PreparedStatement myStmt = database.dbConnect.prepareStatement(query); // Executing the query

            myStmt.setString(1, ItemID);
                        
            int rowCount = myStmt.executeUpdate();   // Excuting the deletion
            
            myStmt.close();

        } catch (SQLException ex) {     
            ex.printStackTrace();       // Error checking
        }  
    }
}
