package annotations.part2;

public class SmsServiceImpl implements SmsService {
  @Override
  public void sendSms(String phoneNumber, String message) {
    System.out.println("Sending SMS to %s, with message %s".formatted(phoneNumber, message));
  }
}
