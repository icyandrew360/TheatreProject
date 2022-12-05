package controllers;

import java.util.*;
import javax.mail.*;

import javax.mail.internet.*;
import javax.activation.*;

public class NotificationController {

    public static void sendMail(String email, double paidAmount, String[] seats ){
        String to = email;
        String from = "jmovies.noreply@gmail.com";
        String host  = "localhost";
        String Str = "Your ticket(s) - \n";

        for (String n: seats){
            Str += n + "\n";
        }
        Str = Str + "The amount paid for the ticket(s) - " + paidAmount;


        Properties properties = new Properties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("jmovies.noreply@gmail.com", "xhllklxkuplnqanp");
            }
        });
        try{

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Payment Successful");
            message.setText(Str);
            Transport.send(message);
            System.out.println("Email Sent!");
        }
        catch(MessagingException mex){
            mex.printStackTrace();
        }



    }
}
