package com.skillovilla.controller;



import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skillovilla.exception.BookException;
import com.skillovilla.exception.UserException;
import com.skillovilla.service.BookService;



@RestController
@RequestMapping(("/users"))
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	
	@PutMapping("/books/{userid}/{bookid}")
	public ResponseEntity<LocalDate> borrowBook(@PathVariable("userid") Long userId,@PathVariable("bookid") Long bookId) throws BookException,UserException{
		
		
		return new ResponseEntity<LocalDate>(bookService.borrowBook(userId, bookId),HttpStatus.OK);
		
		
	}
	
	@PutMapping("/books/return/{userid}/{bookid}")
	public ResponseEntity<String> returnBook(@PathVariable("userid") Long userId,@PathVariable("bookid") Long bookId) throws BookException,UserException{
		
		
		return new ResponseEntity<String>(bookService.returnBook(userId, bookId),HttpStatus.ACCEPTED);
		
		
	}
	
	

	
	
}
