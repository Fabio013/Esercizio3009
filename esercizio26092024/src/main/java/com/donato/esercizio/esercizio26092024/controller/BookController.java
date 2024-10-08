package com.donato.esercizio.esercizio26092024.controller;


import com.donato.esercizio.esercizio26092024.model.CreateBookDTO;
import com.donato.esercizio.esercizio26092024.model.BookDTO;
import com.donato.esercizio.esercizio26092024.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping()
    public ResponseEntity<BookDTO> addBook(@RequestBody @Valid CreateBookDTO createBookDTO) {
        return ResponseEntity.ok(bookService.addBook(createBookDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable("{id}") Long id){
        try{
            BookDTO bookFound = bookService.getBookById(id);
            return ResponseEntity.ok(bookFound);
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }


}
