package tests.junit;

public class InvoiceService {
  public static final Tenant tenantJohn = new Tenant("John", "john@gmail.com");
  public static final Tenant tenantMegan = new Tenant("Megan", "megan@gmail.com");

  private final EmailService emailService;

  public InvoiceService(EmailService emailService) {
    this.emailService = emailService;
  }

  public void sendInvoices() {
    String[] recipients = {tenantMegan.getEmail(), tenantJohn.getEmail()};
    emailService.sendBulkEmail(recipients, "Rent is due", "Please pay your rent");
    tenantMegan.setEmailSent(true);
    tenantJohn.setEmailSent(true);
  }

  public void sendReminder() {
    if (!tenantMegan.hasPaidRent() && tenantMegan.hasReceivedEmail()) {
      emailService.sendEmail(
          tenantMegan.getEmail(), "Reminder rent is due", "Reminder please pay your rent");
    }
    if (!tenantJohn.hasPaidRent() && tenantJohn.hasReceivedEmail()) {
      emailService.sendEmail(
          tenantJohn.getEmail(), "Reminder rent is due", "Reminder please pay your rent");
    }
  }
}
