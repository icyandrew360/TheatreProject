package controllers;

import java.util.*;
import javax.mail.*;

import javax.mail.internet.*;

public class NotificationController {

    //takes email, paid ammount and an array of all the selected seats in and sends
    //an email to the address.
    public static void sendMail(String email, double paidAmount, String[] seats ){
        String to = email.trim();
        String from = "jmovies.noreply@gmail.com";
        //puts together a String with the ticket and receipt to send as the email.
        String Str = "Your ticket(s) - \n";

        //adding the seats of the tickets to the email
        for (String n: seats){
            Str += n + "\n";
        }
        Str = Str + "The amount paid for the ticket(s) - " + paidAmount;

        //defining the properties for the connection dialup

        Properties properties = new Properties();

        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        //creating a session object for the Password Authentication of the FROM email address
        //returns the password and email of the FROM email.
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("jmovies.noreply@gmail.com", "ohxvvxntiluysyyg");
            }
        });
        //tries to send the created message. returns an exception if unable to.
        try{

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Payment Successful");
            message.setText(Str);
            Transport.send(message);
            System.out.println("Email Sent!");
            System.out.println(Str);
        }
        catch(MessagingException mex){
            mex.printStackTrace();
        }

    }
}
