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
    //lists for users, and references to the controllers
    private Vector<RegisteredUser> registeredUsers;
    private Vector<UnRegisteredUser> unRegisteredUsers;
    private UserController userController;
    private TicketController ticketController;
    private ShowController showController;
    
    //constructor
    public Theatre(){
        this.registeredUsers = new Vector<RegisteredUser>();
        this.unRegisteredUsers = new Vector<UnRegisteredUser>();
        //what do we need to do to intialize a theatre
        //1. go through userDB and populate users
        this.userController = new UserController();
        userController.populateUsers(registeredUsers);
        //2. go through ticketDB and add tickets to user objects.
        //also paritally intializes unRegesteredUsers
        this.ticketController = new TicketController();
        userController.populateUserTickets(unRegisteredUsers, registeredUsers, ticketController);
        this.showController = new ShowController();
        
        
    }

    /*
     * will return true if the email and password are an exact
     * match for a record in the database, otherwise false.
     */
    public boolean verifyUser(String email, String password){
        return this.userController.verifyEmailAndPassword(email, password);
    }

    /*
     * returns a reference to a registered user if they exist already
     */
    public RegisteredUser grabRegisteredUser(String email, String password){
        RegisteredUser temp = null;
        for(RegisteredUser i : registeredUsers){
            if(i.getEmail().equals(email) && i.getPassword().equals(password)){
                temp = i;
                break;
            }
        }
        return temp;
    }

    /*
     * registers a user with the database
     */
    public void registerUser(String firstName, String lastName, String email, String password){
        this.registeredUsers.add(new RegisteredUser(firstName, lastName, email, password));
        this.userController.addUser(firstName, lastName, email, password);
    }

    /*
     * validates wether or not an email has been used to create an account already
     */
    public boolean validateEmail(String email){
        boolean isValidEmail = true;
        isValidEmail = this.userController.isValidEmail(email);
        return isValidEmail;
    }

    /*
     * adds a unregistered user temporarily to the system
     * if they have a ticket in the system already, a reference is returned
     */
    public UnRegisteredUser addUnregisteredUser(String firstName,String lastName,String email){
        boolean isInDataBase = false;
        UnRegisteredUser userToAdd = null;
        //check if they are in the database
        for(UnRegisteredUser i : unRegisteredUsers){
            if(i.getEmail().equals(email)){
                isInDataBase = true;
                userToAdd = i;
            }
        }
        //if not, add them 
        if(isInDataBase == false){
            userToAdd = new UnRegisteredUser(firstName, lastName, email);
            this.unRegisteredUsers.add(userToAdd);
        }
        return userToAdd;

    }

    /*
     * adds a ticket to a user, and movie, aswell as the database
     */
    public void addTicket(User user, String seats, String movieName, String showTime){
        //parse showTime into a int
        String[] showTimeAsStrings = showTime.split(":");
        int intTime = Integer.parseInt(showTimeAsStrings[0]) * 60;
        intTime += Integer.parseInt(showTimeAsStrings[1]);
        //create temp ticket and add the ticket to the datbase for movies
        Ticket temp = this.showController.createTicketAndAddSeats(user, seats, movieName, intTime);
        if(user.getTickets() == null)
            user.setTickets(new ArrayList<Ticket>());
        //add the ticket to the user
        user.getTickets().add(temp);
        //add the ticket to the ticket database
        this.ticketController.addTicket(temp, user);
    }

    /*
     * remove ticket from user, movies and tickets databse
     */
    public void removeTicket(User user, Ticket ticket_to_remove){
        //get show time id 
        int movieID = ticket_to_remove.getMovieID();
        //remove the ticket from the user
        user.getTickets().remove(ticket_to_remove);
        //remove the ticker from the tickets and movie databases
        this.ticketController.removeTicket(ticket_to_remove.getEmail());
        this.showController.removeTickets(movieID, ticket_to_remove.getSeatNumber());
    }

    /*
     * return a list of strings for the taken seats of a showTime
     */
    public ArrayList<String> takenSeats(String movieName, String showTime){
        //parse showTime
        String[] showTimeAsStrings = showTime.split(":");
        int intTime = Integer.parseInt(showTimeAsStrings[0]) * 60;
        intTime += Integer.parseInt(showTimeAsStrings[1]);
        //get taken seats from database
        return this.showController.getTakenSeats(movieName, intTime);
    }

    /*
     * returns a movie title most matching the given search key
     */
    public String searchMovie(String movieTitle){
        return this.showController.searchMovie(movieTitle);
    }

    /*
     * returns all showTimes for a movie
     */
    public Vector<String> getMovieShowTimes(String movieTitle){
        //grab show times as integers and then convert to strings
        Vector<Integer> showTimesAsInt = this.showController.getShowTimes(movieTitle);
        Vector<String> showTimesAsString = new Vector<String>();
        //go through list of ints and convert
        for(int i : showTimesAsInt){
            String temp = new String("");
            //divide time as minutes by 60 to get hour, and subtract 12
            //to get 12 hour clock version
            temp += (i/60);
            //add delimeter and add remaining minutes
            temp += ":";
            if(i % 60 < 10) {
                temp += 0;
                temp += i % 60;
            }
            else{
                temp += i % 60;
            }

            showTimesAsString.add(temp);
        }
        return showTimesAsString;
    }

    /*
     * returns the length of a movie
     */
    public String getMovieLength(String movieTitle){
        int movieLength = this.showController.getMovieLength(movieTitle);
        String temp = new String("");
        //divide time as minutes by 60 to get hour, and subtract 12
        //to get 12 hour clock version
        temp += (movieLength/60);
        //add delimeter and add remaining minutes
        temp += ":";
        if(movieLength % 60 < 10) {
            temp += 0;
            temp += movieLength % 60;
        }
        else{
            temp += movieLength % 60;
        }
        return temp;
    }

    public void sendEmailReceipt(double paidAmount, String seats, String email){
        String[] seatsAsArray = seats.split("(?<=\\G.{2})");
        NotificationController.sendMail(email, paidAmount, seatsAsArray);
    }

}
