package com.example.libraryManagement.dao;

import com.example.libraryManagement.entities.Book; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}