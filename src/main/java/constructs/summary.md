## Skeleton code of a Java program

Overview of classes and interfaces in Java.

```java
abstract class Animal {
  private String name;
  private PositiveNumber age;
  private AnimalColor color;

  public Animal(String name, int age, AnimalColor color) {
    this.age = new PositiveNumber(age);
    this.color = color;
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  PositiveNumber getAge() {
    return this.age;
  }

  abstract void makeNoise();
}

record PositiveNumber(int age) {
  public PositiveNumber {
    if (age < 0) {
      throw new IllegalArgumentException("Age must be positive");
    }
  }
}

public enum AnimalColor {
  BLACK,
  WHITE,
  BROWN,
  GREY
}

class Dog extends Animal {

  private String name;
  private PositiveNumber age;

  public Dog(String name, int age, AnimalColor color) {
    super(name, age, color);
  }

  public void makeNoise() {
    System.out.println("Woof!");
  }
}

class Cat implements Animal {

  public Cat(String name, int age, AnimalColor color) {
    super(name, age, color);
  }

  public void makeNoise() {
    System.out.println("Meow!");
  }
}

```