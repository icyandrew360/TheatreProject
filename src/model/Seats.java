package model;
/*
* File: Seats.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627),
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/



public class Seats
{
  private String seatNumber;
  boolean isTaken;

  public Seats(String seatNumber, boolean isTaken){
    this.seatNumber = seatNumber;
    this.isTaken = isTaken;
  }

  public String getSeatNumber(){
    return this.seatNumber;
  }

  public boolean isTaken(){
    return this.isTaken;
  }

  public void setSeatNumber(String newSeatNumber){
    this.seatNumber = newSeatNumber;
  }

  public void setTakenStatus(boolean newStatus){
    this.isTaken = newStatus;
    //this is where we would use some sort of controller
    //to update the database.
  }
}
