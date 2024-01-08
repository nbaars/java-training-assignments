# Spring Boot Assignment

## Introduction

Given an existing Spring Boot application, you will add a new endpoint to the application and write unit tests for the
new endpoint.

## Instructions

### Add a new endpoint

Add a new endpoint to get all the books, with optional filtering by author. The endpoint should be a `GET` request
to `/books`. The endpoint should accept a query parameter `author` and return all books whose author matches the value
of the `author` parameter. If the `author` parameter is not provided, all books should be returned.

### Extend the endpoint

Extend the endpoint to allow filtering by title. The endpoint should accept a query parameter `title` and return all
books whose title matches the value of the `title` parameter. If the `title` parameter is not provided, all books should
be returned.

### Write unit tests

First write unit test for the new repository method. You should write at least one test for each of the following cases:

- The method returns all books when no query parameters are provided
- The method returns all books by a given author when the `author` query parameter is provided
- The method returns all books by a given title when the `title` query parameter is provided
- The method returns all books by a given author and title when both the `author` and `title` query parameters are
  provided
- The method returns no books when the `author` query parameter is provided but no books match the author
- The method returns no books when the `title` query parameter is provided but no books match the title
- The method returns no books when both the `author` and `title` query parameters are provided but no books match the
  author and title
- etc

Write unit tests for the new endpoint. You should write at least one test for each of the following cases:

- The endpoint returns all books when no query parameters are provided
- The endpoint returns all books by a given author when the `author` query parameter is provided
- The endpoint returns all books by a given title when the `title` query parameter is provided

## Tips and Tricks

- You can use the `@RequestParam` annotation to get the value of a query parameter in a Spring Boot controller method.
  For example, if you have a query parameter `author`, you can get its value with `@RequestParam String author`.
- You can use the `@GetMapping` annotation to map a `GET` request to a controller method. For
  example, `@GetMapping("/books")` will map a `GET` request to `/books` to the method annotated with `@GetMapping`.
- You can use @SpringBootTest to create a Spring Boot application context for your unit tests. For
  example, `@SpringBootTest(classes = Application.class)` will create an application context for the `Application`
  class.
- Use @DataJpaTest to create a Spring Boot application context for your unit tests that only includes the JPA
  components. For example, `@DataJpaTest` will create an application context that includes the JPA components.
- Use `@SpringBootTest` and `AutoConfigureMockMvc` to create a Spring Boot application context for your unit tests that
  includes the MVC components. For example, `@SpringBootTest(classes = Application.class)` will create an application
  context for the `Application` class that includes the MVC components.
