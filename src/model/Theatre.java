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

    public RegisteredUser grabRegisteredUser(String email, String password){
        RegisteredUser temp = null;
        for(RegisteredUser i : registeredUsers){
            if(i.getEmail() == email && i.getPassword() == password){
                temp = i;
                break;
            }
        }
        return temp;
    }

    public void registerUser(String firstName, String lastName, String email, String password){
        this.registeredUsers.add(new RegisteredUser(firstName, lastName, email, password));
        this.userController.addUser(firstName, lastName, email, password);
    }

    public void addUnregisteredUser(String firstName,String lastName,String email){
        this.unRegisteredUsers.add(new UnRegisteredUser(firstName, lastName, email));
    }

    // public void addSeatsToShowTime(String movieName, String showTime){

    // }

    public void addTicket(User user, String seats, String movieName, String showTime){
        String[] showTimeAsStrings = showTime.split(":");
        int intTime = Integer.parseInt(showTimeAsStrings[0]) * 60;
        intTime += Integer.parseInt(showTimeAsStrings[1]);
        Ticket temp = this.showController.createTicketAndAddSeats(user, seats, movieName, intTime);
        user.getTickets().add(temp);
        this.ticketController.addTicket(temp, user);
    }

    public void removeTicket(User user, Ticket ticket_to_remove){
        int movieID = ticket_to_remove.getMovieID();
        user.getTickets().remove(ticket_to_remove);
        this.ticketController.removeTicket(ticket_to_remove.getEmail());
        this.showController.removeTickets(movieID, ticket_to_remove.getSeatNumber());
    }


    public ArrayList<String> takenSeats(String movieName, String showTime){
        String[] showTimeAsStrings = showTime.split(":");
        int intTime = Integer.parseInt(showTimeAsStrings[0]) * 60;
        intTime += Integer.parseInt(showTimeAsStrings[1]);
        return this.showController.getTakenSeats(movieName, intTime);
    }

    public String searchMovie(String movieTitle){
        return this.showController.searchMovie(movieTitle);
    }

    public Vector<String> getMovieShowTimes(String movieTitle){
        //grab show times as integers and then convert to strings
        Vector<Integer> showTimesAsInt = this.showController.getShowTimes(movieTitle);
        Vector<String> showTimesAsString = new Vector<String>();
        //go through list of ints and convert
        for(int i : showTimesAsInt){
            String temp = new String("");
            //divide time as minutes by 60 to get hour, and subtract 12
            //to get 12 hour clock version
            if((i / 60) > 12){
                temp += (i/60) - 12;
            }
            else{
                temp += (i/60);
            }
            //add delimeter and add remaining minutes
            temp += ":";
            temp += i % 60;

            showTimesAsString.add(temp);
        }
        return showTimesAsString;
    }


    // public void bookSeat(int showroom, String seatNum, int showTime){
    //     //call the controller function
    //     ShowRoom temp = showRooms[showRoom];
    //     ShowTime tempShowTime = temp.getShowTime(showTime);
    //     Seats tempSeat = tempShowTime.getSeat(seatNum);
    //     controllerfunciton(tmep,tempShowTime,tempSeat)
    // }
}
