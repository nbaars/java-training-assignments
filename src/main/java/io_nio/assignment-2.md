## Writing our own MACOutputStream

### Introduction

In this assignment we will create a custom Java `MACOutputStream` class that extends `FileOutputStream` and calculates a Message Authentication Code (MAC) for the data being written. 

### Steps

First create a `MACOutputStream` class that extends `FileOutputStream`. The `MACOutputStream` class should have a constructor that takes an existing `OutputStream` and a `MessageDigest` as parameters for calculating the MAC. Use or copy `Helper#initMac()` to create a `Mac` instance.

Override the `write(int b)` method to write a single byte to the underlying output stream and update the MessageDigest.
Override the `write(byte[] b, int off, int len)` method to write a specified number of bytes from the provided buffer and update the MessageDigest accordingly.

Implement a method in your `MACOutputStream` class to retrieve the calculated MAC as a byte array.
Provide a method to reset the MessageDigest if needed.

Create a simple Java program that uses your `MACOutputStream` to write data to a file or any other OutputStream.
Calculate the MAC for the written data using the implemented `MACOutputStream` methods.
Print the calculated MAC to the console. 

### Bonus 

Instead of printing the calculated MAC lets write it to the file as well. Append the calculated MAC to the end of the file. A test would look like:

```java
try (var macOutputStream = new MacOutputStream(mac, new File("test.txt"))) {
    macOutputStream.write("Hello World".getBytes());
}
```

Think about implementing appropriate exception handling for potential errors, such as invalid algorithm names or errors during the write operation.