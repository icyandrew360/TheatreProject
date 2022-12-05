package controllers;

import java.util.*;
import javax.mail.*;

import javax.mail.internet.*;
import javax.activation.*;

public class NotificationController {

    public static void sendMail(String email, double paidAmount, String[] seats ){
        String to = email.trim();
        String from = "jmovies.noreply@gmail.com";
        String host  = "smtp.mailtrap.io";
        String Str = "Your ticket(s) - \n";

        for (String n: seats){
            Str += n + "\n";
        }
        Str = Str + "The amount paid for the ticket(s) - " + paidAmount;


        Properties properties = new Properties();

        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("jmovies.noreply@gmail.com", "ohxvvxntiluysyyg");
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
            System.out.println(Str);
        }
        catch(MessagingException mex){
            mex.printStackTrace();
        }



    }
}
