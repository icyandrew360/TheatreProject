package model;
/*
* File: Theatre.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

public class Theatre
{
    private ShowRoom[] showRooms;
    private Movie[] movies;
    private User[] users;
    private static int theatreID =0;
    //this is also where we would have a reference to GUI

    public Theatre(){
        
    }

    // public void bookSeat(int showroom, String seatNum, int showTime){
    //     //call the controller function
    //     ShowRoom temp = showRooms[showRoom];
    //     ShowTime tempShowTime = temp.getShowTime(showTime);
    //     Seats tempSeat = tempShowTime.getSeat(seatNum);
    //     controllerfunciton(tmep,tempShowTime,tempSeat)
    // }
}
