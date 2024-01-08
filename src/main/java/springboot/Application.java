package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Scenario:
 *
 * <p>
 * <li>Rewrite the application to use Spring Data JPA, @EnableJpaRepositories
 * <li>Add entities to author and table annotations
 * <li>Rename create script
 * <li>Remove all JDBC code
 * <li>Add delete endpoint
 * <li>Add endpoint to get books by year
 */
@SpringBootApplication
@EnableJpaRepositories
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
