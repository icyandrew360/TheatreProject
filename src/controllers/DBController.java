
package controllers;

import java.sql.*;

public class DBController {
    //info for connectin to DB
    protected String DBURL;
    protected String USERNAME;
    protected String PASSWORD;    
    protected Connection dbConnect;
    protected ResultSet results;

    public DBController(String url){
        this.DBURL = url;
        this.USERNAME = "student";
        this.PASSWORD = "ensf";
    }

    //Method to create a connection to the database, no arguments, no return value  
    public void initializeConnection(){
        try{
            dbConnect = DriverManager.getConnection(this.DBURL, this.USERNAME, this.PASSWORD); // creating connection
        } catch (SQLException e) {
            e.printStackTrace();                        // Error catching
        }              
    }

    // Url getter
    String getDburl(){
        return this.DBURL;
    }

    // Username getter
    String getUsername(){
        return this.USERNAME;
    }
    
    // Password getter
    String getPassword(){
        return this.PASSWORD;
    }

    

}