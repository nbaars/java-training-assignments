package springboot.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "BOOKS")
public final class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  @OneToOne(cascade = CascadeType.ALL)
  private Author author;

  private int yearPublished;
  private double price;

  private Book() {}

  @JsonCreator
  public Book(String title, Author author, int yearPublished, double price) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public int getYearPublished() {
    return yearPublished;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Book) obj;
    return Objects.equals(this.title, that.title)
        && Objects.equals(this.author, that.author)
        && this.yearPublished == that.yearPublished
        && Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author, yearPublished, price);
  }

  @Override
  public String toString() {
    return "Book["
        + "title="
        + title
        + ", "
        + "author="
        + author
        + ", "
        + "yearPublished="
        + yearPublished
        + ", "
        + "price="
        + price
        + ']';
  }
}
