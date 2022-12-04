package controllers;

import model.*;
import java.sql.*;

public class TicketController {
    private DBController onlyInstance;

    public TicketController(){
       this.onlyInstance = DBController.getConnection();
    }
}
