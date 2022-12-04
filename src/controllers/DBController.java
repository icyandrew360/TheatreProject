
package controllers;

import java.sql.*;

public class DBController {
    //info for connectin to DB
    protected String DBURL;
    protected String USERNAME;
    protected String PASSWORD;    
    protected Connection dbConnect;
    protected ResultSet results;
    private static DBController onlyInstance;

    private DBController(){
        this.DBURL = "jdbc:mysql://localhost/userdatabase";
        this.USERNAME = "student";
        this.PASSWORD = "ensf";
        try{
            dbConnect = DriverManager.getConnection(this.DBURL, this.USERNAME, this.PASSWORD); // creating connection
        } catch (SQLException e) {
            e.printStackTrace();                        // Error catching
        }   
    }

    public static DBController getConnection(){
        if(onlyInstance == null){
            onlyInstance = new DBController();
        }
        return onlyInstance;
    }

    public static void closeConnection(){
        if(onlyInstance != null){
            try {
                if(onlyInstance.getResults() != null)
                    onlyInstance.getResults().close();     // Closing Connection
                
                onlyInstance.getDBConnection().close();   // Closing ResultSet
            } catch (SQLException e) {
                e.printStackTrace();    // Error checking
            }              
        }
        onlyInstance = null;
    }

    // Url getter
    public String getDburl(){
        return this.DBURL;
    }

    // Username getter
    public String getUsername(){
        return this.USERNAME;
    }
    
    // Password getter
    public String getPassword(){
        return this.PASSWORD;
    }

    public Connection getDBConnection(){
        return this.dbConnect;
    }

    public ResultSet getResults(){
        return this.results;
    }

    

}