/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjForm;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Matúš
 */
public class Email {
    
    public void sendEmail(String user, String to, String subject, String messageText) 
    {
       boolean set_Result = true;
        
      
        
          //final String username = "matuss182@gmail.com"; // enter your mail id
          
          final String username = "matuss182@gmail.com"; // enter your mail id
		final String password = "srfutbal";// enter ur password

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("matuss182@gmail.com")); // same email id 
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(to));// whome u have to send mails that person id
			message.setSubject(subject);
			message.setText(messageText);

			Transport.send(message);
                        
                        set_Result = true;
                        JOptionPane.showMessageDialog(null, "Email successfully sent");
                       
                        

		} catch (MessagingException e) {
                    
                         set_Result = true;
                         JOptionPane.showMessageDialog(null, "Error during sending mail");
                        
			throw new RuntimeException(e);
                        
                       
		}
		
    
}
}
