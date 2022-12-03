package controllers;



public class NotificationController {
    private DBController database;

    public NotificationController(){
        this.database = DBController.getConnection();
    }


}
