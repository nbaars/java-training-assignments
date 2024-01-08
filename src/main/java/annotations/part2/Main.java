package annotations.part2;

import annotations.part1.EmailService;

public class Main {

  public static void main(String[] args) {
    BeanFactory proxyFactory = new BeanFactory();

    EmailService emailService = proxyFactory.getBean(EmailService.class);
    emailService.sendEmail("john@gmail.com", "We implemented @Timed for all classes");

    SmsService smsService = proxyFactory.getBean(SmsService.class);
    smsService.sendSms("0611111111", "Hi, we have implemented @Timed for all classes");
  }
}
