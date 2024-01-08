package functional.streams;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Author john = new Author("John", 30);
    Author sarah = new Author("Sarah", 32);
    Author tom = new Author("Tom", 45);
    List<Author> authors = List.of(john, sarah, tom);

    Book java = new Book("Java", john, 2019, 45.0);
    Book kotlin = new Book("Kotlin", john, 2019, 2.0);
    Book python = new Book("Python", sarah, 2019, 145.0);
    Book ruby = new Book("Ruby", tom, 2019, 34.0);
    Book rust = new Book("Rust", tom, 2019, 23.0);
    List<Book> books = List.of(java, kotlin, python, ruby, rust);

    Library library = new Library(books);
  }
}
