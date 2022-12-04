package controllers;

import java.util.*;
import javax.mail.*;

import javax.mail.internet.*;
import javax.activation.*;

public class NotificationController {

    public void sendMail(String email){
        String to = email;
        String from = "jmovies.noreply@gmail.com";

        String host  = "localhost";

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.google.com");
        properties.put("mail.smtp.port", 587);

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("jmovies.noreply@gmail.com", "ensf-480");
            }
        });
        try{

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Payment Successful");
            message.setText("Your ticket number is ");
            Transport.send(message);
            System.out.println("Email Sent!");
        }
        catch(MessagingException mex){
            mex.printStackTrace();
        }



    }
}
