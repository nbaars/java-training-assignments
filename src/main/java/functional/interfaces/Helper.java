package functional.interfaces;

public class Helper {
  @FunctionalInterface
  public interface Combiner {
    String get();

    default Combiner concatenate(Combiner other) {
      return () -> get() + other.get();
    }
  }

  public static void main(String[] args) {
    Combiner hello = () -> "Hello";
    Combiner space = () -> " ";
    Combiner world = () -> "World";
    Combiner helloWorld = hello.concatenate(space).concatenate(world);
    System.out.println(helloWorld.get());
  }
}
