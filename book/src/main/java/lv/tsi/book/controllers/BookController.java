package lv.tsi.book.controllers;


import lv.tsi.book.entities.Book;
import lv.tsi.book.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> findBooks() {
        Iterable<Book> iterable = bookRepository.findAll();
        List<Book> list = Streamable.of(iterable).toList();

        return ResponseEntity.ok(list);
    }

    @GetMapping(value={"/getBook", "book"})
    public ResponseEntity<Book> findBook(@RequestParam(value="id") Long id) {
        Optional<Book> book = bookRepository.findById(id);

        if (book.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(book.get());
    }
}
