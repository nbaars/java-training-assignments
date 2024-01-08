package annotations.part1;

import java.util.UUID;

public class EmailServiceImpl implements EmailService {
  @Override
  public void sendEmail(String recipient, String message) {
    System.out.println("Sending email to " + recipient + " with message: " + message);
  }

  @Override
  public void deleteEmail(UUID emailId) {
    System.out.println("Deleting email to " + emailId);
  }
}
