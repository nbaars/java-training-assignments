package springboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboot.domain.Book;

@RestController
@RequestMapping("/library")
public class LibraryController {

  private final LibraryService libraryService;

  public LibraryController(LibraryService libraryService) {
    this.libraryService = libraryService;
  }

  @PostMapping("/books")
  public Book addBook(@RequestBody Book book) {
    libraryService.addBook(book);
    return book;
  }

  @DeleteMapping("/books")
  public void deleteBook(@RequestParam String title) {
    libraryService.deleteBook(title);
  }
}
