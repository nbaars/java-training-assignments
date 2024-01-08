package maven;

// import org.apache.commons.lang3.StringUtils;

public class MavenDemo {

  public static String sayHello(String name) {
    //    if (StringUtils.isEmpty(name)) {
    //      return "Hello Maven!";
    //    }
    return "Hello %s!".formatted(name);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println(sayHello(null));
    } else {
      System.out.println(sayHello(args[0]));
    }
  }
}
