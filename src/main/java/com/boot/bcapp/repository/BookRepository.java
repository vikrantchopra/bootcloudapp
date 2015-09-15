package com.boot.bcapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.bcapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
