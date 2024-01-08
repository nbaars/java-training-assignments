package tests.tests_dependency_injection;

import tests.junit.EmailService;

public class Application {
  private EmailService emailService = new EmailService();

  public void sendInvoices() {
    // Get tenants from database and send them invoices
    emailService.sendEmail(
        "john@gmail.com", "Rent is due", "Please pay your rent of 12000$ to my bank account");
  }
}
