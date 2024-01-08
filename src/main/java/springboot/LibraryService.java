package springboot;

import java.util.List;
import org.springframework.stereotype.Service;
import springboot.domain.Book;

@Service
public class LibraryService {

  private final LibraryRepository libraryRepository;

  public LibraryService(LibraryRepository libraryRepository) {
    this.libraryRepository = libraryRepository;
  }

  public List<Book> getAllBooks() {
    return libraryRepository.findAll();
  }

  public List<Book> getBooksByTitle(String title) {
    return libraryRepository.findByTitle(title);
  }

  public void addBook(Book book) {
    if (book.getPrice() >= 100) {
      throw new IllegalArgumentException("Book price above 100, nobody will buy it!");
    }
    libraryRepository.saveAndFlush(book);
  }

  public void deleteBook(String title) {
    libraryRepository.deleteByTitle(title);
  }
}
