package tests.junit;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {

  public boolean sendEmail(String recipient, String subject, String body) {
    String from = "web@gmail.com";
    String host = "localhost";
    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", host);
    Session session = Session.getDefaultInstance(properties);

    try {
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
      message.setSubject(subject);
      message.setText(body);
      Transport.send(message);
      System.out.println("Sent message successfully....");
    } catch (MessagingException mex) {
      mex.printStackTrace();
      return false;
    }
    return true;
  }

  public void sendBulkEmail(String[] recipients, String subject, String body) {
    for (String recipient : recipients) {
      sendEmail(recipient, subject, body);
    }
  }
}
