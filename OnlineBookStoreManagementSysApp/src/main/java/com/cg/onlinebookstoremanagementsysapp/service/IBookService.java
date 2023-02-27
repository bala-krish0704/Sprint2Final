package com.cg.onlinebookstoremanagementsysapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinebookstoremanagementsysapp.entity.Book;

public interface IBookService {
	//Get Methods
		public List<Book> getAllBooks();
		public Optional<Book> getBooksById(long bookId);
		//public List<Book> getAllBooksBySId(long sellerId);
		
		//Post Methods
		public Optional<Book> addBook(Book book);
		//public List<Book> addBook(Book book);//Bulk Inserting for Books
		
		//Put Methods
		public String updateBookById(Book bookId);

		
		//Delete Methods
		public String deleteBookById(long bookId);
		
}
