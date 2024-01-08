package annotations.part1;

public class EmailServiceFactory {

  public static EmailService createEmailService() {
    return new EmailServiceImpl();
  }
}
