package com.renatoflores.bookstoremanager.repository;

import com.renatoflores.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
