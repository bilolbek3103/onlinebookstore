package uz.bilmax.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bilmax.onlinebookstore.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
