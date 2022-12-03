package controllers;

public class PaymentController {
    private DBController database;

    public PaymentController(){
        this.database = DBController.getConnection();
    } 
}
