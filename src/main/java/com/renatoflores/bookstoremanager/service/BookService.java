package com.renatoflores.bookstoremanager.service;

import com.renatoflores.bookstoremanager.dto.BookDTO;
import com.renatoflores.bookstoremanager.dto.MessageResponseDTO;
import com.renatoflores.bookstoremanager.entity.Book;
import com.renatoflores.bookstoremanager.mapper.BookMapper;
import com.renatoflores.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public MessageResponseDTO create(BookDTO bookDTO) {

        Book bookToSave = bookMapper.bookDTOToBook(bookDTO);

        Book saveBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + saveBook.getId())
                .build();
    }
}
