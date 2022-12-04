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

public class Theatre
{
    private Vector<ShowRoom> showRooms;
    private Vector<User> users;
    private static int theatreID =0;
    //this is also where we would have a reference to GUI

    public Theatre(){
        //what do we need to do to intialize a theatre
        //1. go through userDB and populate users
        //2. go through ticketDB and add tickets to user objects.
        //3. go through moviesDB and ticketDB and populate ShowRooms / ShowTimes
    }



    // public void bookSeat(int showroom, String seatNum, int showTime){
    //     //call the controller function
    //     ShowRoom temp = showRooms[showRoom];
    //     ShowTime tempShowTime = temp.getShowTime(showTime);
    //     Seats tempSeat = tempShowTime.getSeat(seatNum);
    //     controllerfunciton(tmep,tempShowTime,tempSeat)
    // }
}
