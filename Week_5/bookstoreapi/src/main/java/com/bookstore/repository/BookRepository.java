package com.bookstore.repository;


import com.bookstore.*;
import com.bookstore.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    // Find a book by its title
    Optional<Book> findByTitle(String title);

    // Find books by author
    List<Book> findByAuthor(String author);
}
