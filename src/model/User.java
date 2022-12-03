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

public class User
{
  private String firstName;
  private String lastName;
  private String email;
  private ArrayList<Ticket> tickets;
  private ArrayList<Payment> paymentHistory;

  public User(){

  }

  public void addPayment(Payment payment){
    paymentHistory.add(payment);
  }
  public void addTicket(Ticket ticket){
    tickets.add(ticket);
  }

  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public String getEmail() {return email;}
  public ArrayList<Ticket> getTickets() {return tickets;}
  public ArrayList<Payment> getPaymentHistory() {return paymentHistory;}

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
  public void setPaymentHistory(ArrayList<Payment> payments){
    this.paymentHistory = payments;
  }
}
