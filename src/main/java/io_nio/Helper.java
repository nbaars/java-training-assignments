package io_nio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Helper {

  public static void main(String[] args) throws IOException {
    try {
      calculate();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      e.printStackTrace();
    }
  }

  public static Mac initMac() throws NoSuchAlgorithmException, InvalidKeyException {
    KeyGenerator keygen = KeyGenerator.getInstance("HmacSHA512");
    keygen.init(256);
    SecretKey hmacKey = keygen.generateKey();

    Mac mac =
        Mac.getInstance(
            "HmacSHA512"); // get access to Mac object which implements HmacSHA512 algorithm.
    mac.init(new SecretKeySpec(hmacKey.getEncoded(), "HmacSHA512"));
    return mac;
  }

  public static void calculate() throws NoSuchAlgorithmException, InvalidKeyException {
    KeyGenerator keygen = KeyGenerator.getInstance("HmacSHA512");
    keygen.init(256);
    SecretKey hmacKey = keygen.generateKey();

    Mac mac =
        Mac.getInstance(
            "HmacSHA512"); // get access to Mac object which implements HmacSHA512 algorithm.
    mac.init(new SecretKeySpec(hmacKey.getEncoded(), "HmacSHA512"));

    mac.update("Hello World".getBytes());
    var result = mac.doFinal();
    System.out.println(result);
  }
}
