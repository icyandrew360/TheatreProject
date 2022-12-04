package controllers;

import java.sql.*;

public class SeatsController{//these will refer to the singleton DBcontroller
    private DBController database;

    public SeatsController(){
        database = DBController.getConnection();
        // super("temp url that should be changed");
        // super.initializeConnection();
    }

}