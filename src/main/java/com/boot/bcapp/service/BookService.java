package com.boot.bcapp.service;

import com.boot.bcapp.model.Book;

public interface BookService {

	public void addBook(Book book);
	
	public void deleteBook(Long id);
	
	public Iterable<Book> showBooklist();
	
	//public Book updateBook(Book book);
	
	public Book findById(Long id);
}
