package springboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.domain.Book;

@Repository
public interface LibraryRepository extends JpaRepository<Book, Long> {
  List<Book> findByTitle(String title);

  void deleteByTitle(String name);
}
