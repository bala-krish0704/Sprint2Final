package com.cg.onlinebookstoremanagementsysapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinebookstoremanagementsysapp.entity.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {

}
