package com.cg.onlinebookstoremanagementsysapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinebookstoremanagementsysapp.entity.Book;
import com.cg.onlinebookstoremanagementsysapp.repository.BookRepository;
@Service
public class BookService implements IBookService{
	
	@Autowired
	private BookRepository bookRepo;
	
	
	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Optional<Book> getBooksById(long bookId) {
		return bookRepo.findById(bookId);
	}

	
	@Override
	public Optional<Book> addBook(Book book) {
		if (bookRepo.existsById(book.getBookId())){
            return Optional.empty();
        }else{
            return Optional.of(bookRepo.save(book));
        }
	}

	@Override
	public String updateBookById(Book bookId) {
		if (bookRepo.existsById(bookId.getBookId())){
			Book adUp =bookRepo.save(bookId);
			if(adUp!=null)
				return "Book Updated Successfully";
	    }else{
	        return "Can't Update Book caused by Wrong information ";
	    }
		return "The Given Book was already Exits!";
	}

	@Override
	public String deleteBookById(long bookId) {
		if (bookRepo.existsById(bookId) && bookId!=0){
			bookRepo.deleteById(bookId);
	    	return bookId + "Deleted successfully!";
	    }else{
	        return "The Book does not exist in records!";
	    }
	    
	}

}
