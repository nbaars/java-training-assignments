## Maven assignment

- Uncomment the code in `MavenDemo.java` and add the missing dependency to `pom.xml` so that the code compiles and runs.
- Add Guava dependency to `pom.xml` and use `Precondition` to check that the `name` parameter is not `null` or empty.
- Run `mvn clean` and `mvn install` and check that the build succeeds.
- Run `mvn dependency:tree` and check that the Guava dependency is included in the output.
- Run `mvn site` and check that the site is generated in `target/site`.
