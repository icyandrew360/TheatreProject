package model;
/*
* File: Ticket.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

public class Ticket
{
    private int movieID;
    private String email;
    private String seatNumber;
    private int showRoom;
    private int showTime;
    private String showDate;

    public Ticket(int movieID, String email, String seat, 
    int showRoom, int showTime, String showDate){
        this.movieID = movieID;
        this.email = email;
        this.seatNumber = seat;
        this.showRoom = showRoom;
        this.showTime = showTime;
        this.showDate = showDate;
    }

    public int getMovieID(){
        return this.movieID;
    }

    public String getEmail(){
        return this.email;
    }

    public String getSeatNumber(){
        return this.seatNumber;
    }

    public int getShowRoom(){
        return this.showRoom;
    }

    public int getShowTime(){
        return this.showTime;
    }

    public String getShowDate(){
        return this.showDate;
    }
  
}
