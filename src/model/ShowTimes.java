package model;/*
* File: ShowTimes.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import java.util.Vector;

public class ShowTimes
{
  private int showTime;
  private String showDate;
  private Vector<Seats> seats;

  public ShowTimes(int showTime, String showDate){
    this.showTime = showTime;
    this.showDate = showDate;
    this.seats = new Vector<Seats>(0);
    for(int i =0; i < 30; i++){
        this.seats.add(new Seats("" + i, false));
    }
  }

  public int getShowTime(){
    return this.showTime;
  }

  public String getShowDate(){
    return this.showDate;
  }


  public Seats getSeat(String seatNum){
    Seats temp = null;
    for(int i =0; i < seats.size(); i++){
        if(seats.get(i).getSeatNumber() == seatNum){
            temp = seats.get(i);
            break;
        }
    }
    return temp;
  }

  public void setShowtime(int newShowTime){
    this.showTime = newShowTime;
  }

  public void setShowDate(String newShowDate){
    this.showDate = newShowDate;
  }

  public void setSeatStatus(int seatNumber, boolean isTaken){
    (this.seats.get(seatNumber)).setTakenStatus(isTaken);
  }

}
