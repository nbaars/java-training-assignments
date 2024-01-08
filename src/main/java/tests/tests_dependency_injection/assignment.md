## Dependency injection

Also at unit test level, dependency injection is a very important concept. It allows you to test a class in isolation.

First try to write a unit test for `Application` class. You will notice that it is not possible to do this because
the `Application` class has a dependency on `EmailService` which you cannot influence from the unit test.

## Task 

Rewrite the `Application` class to use dependency injection and write a unit test for it.