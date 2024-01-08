package tests.junit;

public class Tenant {
  private final String name;
  private final String email;
  private boolean emailSent;
  private boolean hasPaidRent;

  public Tenant(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void setEmailSent(boolean emailSent) {
    this.emailSent = emailSent;
  }

  public void setHasPaidRent(boolean hasPaidRent) {
    this.hasPaidRent = hasPaidRent;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public boolean hasReceivedEmail() {
    return emailSent;
  }

  public boolean hasPaidRent() {
    return hasPaidRent;
  }
}
