package com.donato.esercizio.esercizio26092024.service;


import com.donato.esercizio.esercizio26092024.entity.Book;
import com.donato.esercizio.esercizio26092024.model.CreateBookDTO;
import com.donato.esercizio.esercizio26092024.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;



    public CreateBookDTO addBook (CreateBookDTO createBookDTO){

        Book newBook = new Book();
        newBook.setTitolo(createBookDTO.getTitolo());
        newBook.setDescrizione(createBookDTO.getDescrizione());

        return bookRepository.save(newBook);

    }





}
