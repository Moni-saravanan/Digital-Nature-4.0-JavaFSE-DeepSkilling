package com.example.LibraryManagement;

import com.example.LibraryManagement.repository.BookRepository;
import com.example.LibraryManagement.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookService = (BookService) context.getBean("bookService");
		bookService.processBook();
		BookRepository bookRepository=(BookRepository) context.getBean("bookRepository");
		bookRepository.saveBook();
	}
}
