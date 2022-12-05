package model;
import java.util.ArrayList;
/*
* File: User.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

//contains user infromation
public class User
{
  protected String firstName;
  protected String lastName;
  protected String email;
  protected ArrayList<Ticket> tickets;
  protected ArrayList<Payment> paymentHistory;
  protected boolean isReg;

  //constructor
  public User(String firstName, String lastName, String email, boolean isReg){
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.isReg = isReg;
  }

  /*
   * adds payment object to payment
   */
  public void addPayment(Payment payment){
    paymentHistory.add(payment);
  }
  /*
   * adds ticket to tickets
   */
  public void addTicket(Ticket ticket){
    tickets.add(ticket);
  }

  //getters
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public String getEmail() {return email;}
  public boolean getIsRegistered(){return isReg;}
  public ArrayList<Ticket> getTickets() {return tickets;}
  public ArrayList<Payment> getPaymentHistory() {return paymentHistory;}

  //setters
  public void setFirstName(String name){
    this.firstName = name;
  }
  public void setLastName(String name){
    this.lastName = name;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setTickets(ArrayList<Ticket> tickets){
    this.tickets = tickets;
  }
  public void setIsRegistered(boolean isReg){
    this.isReg = isReg;
  }
  public void setPaymentHistory(ArrayList<Payment> payments){
    this.paymentHistory = payments;
  }
}
