package com.donato.esercizio.esercizio26092024.controller;


import com.donato.esercizio.esercizio26092024.model.CreateBookDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping()
    public ResponseEntity<?> addBook(@RequestBody @Valid CreateBookDTO createBookDTO) {
        return ResponseEntity.ok(createBookDTO);

    }



}
