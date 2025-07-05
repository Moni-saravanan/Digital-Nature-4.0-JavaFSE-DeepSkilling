package com.example.LibraryManagement.service;

import com.example.LibraryManagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void processBook() {
        System.out.println("Processing book...");
        bookRepository.saveBook();
    }
}