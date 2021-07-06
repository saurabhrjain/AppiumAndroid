package org.example.busticket.MobileApp;


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class sendMail {

    public static void sendDeatils(String Details) throws Exception {
        // TODO Auto-generated method stub
        String recepient="xyz@gmail.com";
        Properties properties = new Properties();
        //conf.mailhandler.mail.smtp.auth=true
        //	conf.mailhandler.mail.user=mygmail@gmail.com
        //conf.mailhandler.mail.smtp.starttls.enable=true
        //conf.mailhandler.mail.smtp.starttls.required=true
        properties.put("mail.smtp.auth","true")	;
        properties.put("mail.smtp.starttls.enable","true")	;
        properties.put("mail.smtp.starttls.required","true")	;
        properties.put("mail.smtp.host","smtp.googlemail.com")	;
        properties.put("mail.smtp.port","587")	;

        final String myAccountEmail="xyz123@gmail.com";
        final String password="Password123";

        Session session =Session.getInstance(properties,new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail,password);
            }

        });

        Message message = prepareMessage(session,myAccountEmail,recepient,Details);

        Transport.send(message);

    }

    private static Message prepareMessage(Session session,String myAccountEmail,String recepient,String Details) {

        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Automation Digi thon mail");
            message.setText(Details);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE,null,ex);

        }
        return null;
    }

}
