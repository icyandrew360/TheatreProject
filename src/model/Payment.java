package model;
/*
* File: Payment.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

public class Payment
{
  double amount;
  boolean payed = false;
  
  public Payment(double amount){
    this.amount = amount;
  }

  public double getAmountDue(){
    return this.amount;
  }

  public boolean isPayed(){
    return this.payed;
  }

  public void setAmountDue(double newAmount){
    this.amount = newAmount;
  }

  public void payFee(){
    this.payed = true;
  }

}
