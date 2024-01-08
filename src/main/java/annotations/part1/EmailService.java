package annotations.part1;

import java.util.UUID;

public interface EmailService {

  void sendEmail(String recipient, String message);

  void deleteEmail(UUID emailId);
}
