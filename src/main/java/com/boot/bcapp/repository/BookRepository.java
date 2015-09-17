package com.boot.bcapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.bcapp.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
