package com.renatoflores.bookstoremanager.mapper;

import com.renatoflores.bookstoremanager.dto.BookDTO;
import com.renatoflores.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book bookDTOToBook(BookDTO bookDTO);

    BookDTO booktoBookDTO(Book book);
}
