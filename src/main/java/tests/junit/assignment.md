## Unit testing

- [ ] Add JUnit dependency to `pom.xml`.
- [ ] Write a unit test for the `rent` method in the `House` class.
- [ ] Use AssertJ to check that the rent is calculated correctly.
- [ ] Run `mvn test` and check that the test passes.
- [ ] Write a unit test for the `tax` method in the `Apartment` class.
- [ ] Take a look at `InvoiceService.java` and write a unit test for both methods in this class. You will need to use
  Mockito to mock the `InvoiceRepository` dependency. You can change the `Tenant` state in the unit test to make sure
  the methods are invoked when you expect them to be invoked. 