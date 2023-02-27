package com.cg.onlinebookstoremanagementsysapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.onlinebookstoremanagementsysapp.service.BookService;
import com.cg.onlinebookstoremanagementsysapp.entity.Book;
	@CrossOrigin("*")
	@RestController
	@RequestMapping("/api/v1/book")
	public class BookController {
		@Autowired
		private BookService bookService;
		
		
		@PostMapping
		public String saveBook(@RequestBody Book book) {
			try {
				Optional<Book> Vbook = bookService.addBook(book);
				if(Vbook.isPresent()) {
					return "The new Book Added Successfully";
				}else {
					return "Something went wrong during book Insertion";
				}
			} catch(Exception e) {
				return "Something Went Wrong during book Insertion";
			}
		}
		
		@GetMapping("/getbooks")
		public List<Book> getAllBook(){
			return bookService.getAllBooks();
		}
		
		@GetMapping("/{book_id}")
		public Optional<Book> getBookById(@PathVariable("book_id") long bookId){
			return bookService.getBooksById(bookId);
		}
		
		@PutMapping
		public String updateBook(@RequestBody Book book) {
			String Vbook = bookService.updateBookById(book);
			if(Vbook.isEmpty()) {
				return "The Given Information was wrong";
			}
				else {
					return "Book Updated Successfully";
				}
		}	
		@DeleteMapping("/{book_id}")
		public String deleteEmployeeById(@PathVariable("book_id") long book_id) {
			String result = bookService.deleteBookById(book_id);
			return result;
		}
	}
