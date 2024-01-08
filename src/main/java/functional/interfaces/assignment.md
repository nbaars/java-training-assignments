## Functional interfaces

# Assignment: Custom Functional Interface Class

To create and utilize a custom `@FunctionalInterface` class in Java.

## Instructions

1. **Create the functional interface**
    - Design a functional interface class named `StringManipulator` with a single abstract
      method `manipulate(String input)` that takes a string as input and returns a manipulated version of the string.

2. **Implement three operations**
    - Implement the `StringManipulator` interface with at least three different string manipulation operations (e.g. reverse, uppercase, lowercase).
    - Each method should perform a specific string manipulation and return the result.
    - Add a method to the `StringManipulator` interface that takes a `StringManipulator` instance as a parameter and
      returns a new `StringManipulator` instance that performs the original manipulation followed by the new one.
    - Validate that `reverse(uppercase(lowercase("Hello")))` returns "OLLEH".
    - Validate that `reverse(reverse("Hello"))` returns "Hello"

3. **Use the functional interface**
    - In a separate class (`Main` class), create a method named `performManipulation` that takes a string and
      a `StringManipulator` instance as parameters and executes the manipulation.
    - Try to combine `reverse`, `uppercase`, `lowercase` in the
      `performManipulation` method. You can add a default method to the `StringManipulator` interface to combine the
      operations.
