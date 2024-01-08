# Let's write a timing annotation

In this exercise we will write a custom annotation that can be used to measure the execution time of a method.

The annotation will be called `@Timed` and will be used like this:

```java
@Timed
public void sendEmail(String record,String message){
        // ...
        }
```

And the log output will look like this:

```
sendEmail() took 123 ms
```

There a three classes given for this exercise:

- `EmailSerice` is the interface.
- `EmailServiceImpl` is the implementation.
- `EmailServiceFactory` creates an instance of `EmailService` and is called in `Main.java`.


## Step 1: Create the @Timed annotation

Create a new annotation called `@Timed` in the `day1.annotations` package. The annotation should only be used on the
`sendEmail` method in the `EmailService` interface.

## Step 2: Create the annotation processor

Write code which looks for the `@Timed` annotation and log the execution time of the method.

## Step 3: Update the `EmailServiceFactory` to return a proxy instance.

The proxy instance should implement the `EmailService` and should be created using the `Proxy` class. The proxy should
log the execution time of the `sendEmail` method.

Now run the `Main` class and check that the execution time is logged.
