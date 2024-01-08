package annotations.part1;

public class Main {
  public static void main(String[] args) {
    EmailService emailService = EmailServiceFactory.createEmailService();
    emailService.sendEmail("john@gmail.com", "We are working on your timing request.");
  }
}
