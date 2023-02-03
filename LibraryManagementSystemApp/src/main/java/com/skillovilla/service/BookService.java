package com.skillovilla.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.skillovilla.exception.BookException;
import com.skillovilla.exception.UserException;

@Service
public interface BookService {

	
	public LocalDate borrowBook(Long userId,Long bookId) throws BookException,UserException;
	
	public String returnBook(Long userId,Long bookId) throws BookException,UserException;
	
}
