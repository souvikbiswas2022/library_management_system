package com.skillovilla.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillovilla.exception.BookException;
import com.skillovilla.exception.UserException;
import com.skillovilla.model.Book;
import com.skillovilla.model.User;
import com.skillovilla.repository.BookRepo;
import com.skillovilla.repository.UserRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BookRepo bookRepo;

	@Override
	public LocalDate borrowBook(Long userId, Long bookId) throws BookException, UserException {

		Optional<User> checkUserPresence = userRepo.findById(userId);

		if (checkUserPresence.isPresent()) {

			User user = checkUserPresence.get();

			Optional<Book> checkBookPresence = bookRepo.findById(bookId);

			if (checkBookPresence.isPresent()) {

				if(checkBookPresence.get().getStatus()==true) {
					throw new BookException(" This book is  already issued.Choose another one ...! ");	
				}
				
				if (user.getIssuedBooks().size() < 5) {

					Book issuedBook = checkBookPresence.get();

					issuedBook.setStatus(true);
					issuedBook.setIssuedDate(LocalDate.now());

					issuedBook.setUser(user);
					bookRepo.save(issuedBook);
					
					LocalDate date = LocalDate.now();
					return date.plusDays(10);

				} else
					throw new BookException(" You already issued five books...! ");

			} else

				throw new BookException("Invalid book id...! ");

		}

		else

			throw new UserException("Invalid user id...! ");

	}

	@Override
	public String returnBook(Long userId, Long bookId) throws BookException, UserException {

		Optional<User> checkUserPresence = userRepo.findById(userId);

		if (checkUserPresence.isPresent()) {

			User user = checkUserPresence.get();

			Optional<Book> checkBookPresence = bookRepo.findById(bookId);

			if (checkBookPresence.isPresent()) {

				LocalDate issuedDate = checkBookPresence.get().getIssuedDate();
				LocalDate dueDate = issuedDate.plusDays(10);

				if (dueDate.isBefore(LocalDate.now())) {

					long noOfDueDays = ChronoUnit.DAYS.between(dueDate, LocalDate.now());

					Double fineValue = noOfDueDays * 50.00;

					return "You have to pay " + fineValue + " rupees fine value.";

				} else {

					Book returnedBook = checkBookPresence.get();
					returnedBook.setIssuedDate(null);
					returnedBook.setStatus(false);
					returnedBook.setUser(null);

					bookRepo.save(returnedBook);

					return "Thank you...! Book returned successfully..!";

				}

			} else

				throw new BookException("Invalid book id...! ");

		}

		else

			throw new UserException("Invalid user id...! ");

	}

}
