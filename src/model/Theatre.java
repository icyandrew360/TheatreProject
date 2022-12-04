package model;
/*
* File: Theatre.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import java.util.Vector;
import controllers.*;
import java.util.ArrayList;

public class Theatre
{
    private Vector<ShowRoom> showRooms;
    private Vector<RegisteredUser> registeredUsers;
    private Vector<UnRegisteredUser> unRegisteredUsers;
    private static int theatreID =0;
    private UserController userController;
    private TicketController ticketController;
    private ShowController showController;
    private PaymentController paymentController;
    private NotificationController notificationController;
    

    //this is also where we would have a reference to GUI

    public Theatre(){
        //what do we need to do to intialize a theatre
        //1. go through userDB and populate users
        this.userController = new UserController();
        userController.populateUsers(registeredUsers);
        //2. go through ticketDB and add tickets to user objects.
        //also paritally intializes unRegesteredUsers
        this.ticketController = new TicketController();
        userController.populateUserTickets(unRegisteredUsers, registeredUsers, ticketController);
        //3. go through moviesDB and ticketDB and populate ShowRooms / ShowTimes
        
    }

    /*
     * will return true if the email and password are an exact
     * match for a record in the database, otherwise false.
     */
    public boolean verifyUser(String email, String password){
        return this.userController.verifyEmailAndPassword(email, password);
    }

    public void registerUser(String firstName, String lastName, String email, String password){
        this.registeredUsers.add(new RegisteredUser(firstName, lastName, email, password));
        this.userController.addUser(firstName, lastName, email, password);
    }

    // public void addSeatsToShowTime(String movieName, String showTime){

    // }

    public void addTicket(User user, String seats, String movieName, String showTime){
        
    }

    public ArrayList<String> takenSeats(String movieName, String showTime){
        String[] showTimeAsStrings = showTime.split(":");
        int intTime = Integer.parseInt(showTimeAsStrings[0]) * 60;
        intTime += Integer.parseInt(showTimeAsStrings[1]);
        return this.showController.getTakenSeats(movieName, intTime);
    }



    // public void bookSeat(int showroom, String seatNum, int showTime){
    //     //call the controller function
    //     ShowRoom temp = showRooms[showRoom];
    //     ShowTime tempShowTime = temp.getShowTime(showTime);
    //     Seats tempSeat = tempShowTime.getSeat(seatNum);
    //     controllerfunciton(tmep,tempShowTime,tempSeat)
    // }
}
