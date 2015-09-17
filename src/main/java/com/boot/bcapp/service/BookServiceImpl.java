package com.boot.bcapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.bcapp.model.Book;
import com.boot.bcapp.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	
	//@Resource
	@Autowired
	protected BookRepository bookRepository;
	
	@Override
	@Transactional
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		Book aBook = book;
		this.bookRepository.save(aBook);
	}

	@Override
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		Book deleteBook = this.bookRepository.findOne(id);
                 
		bookRepository.delete(deleteBook);
	}

	@Override
	public Iterable<Book> showBooklist() {
		// TODO Auto-generated method stub
		return this.bookRepository.findAll();
	}

	/*@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		Book aBook = book;
		aBook.setAuthor(book.getAuthor());
		aBook.setDescription(book.getDescription());
		aBook.setIsbn(book.getIsbn());
		aBook.setTitle(book.getTitle());
		
		this.bookRepository.save(aBook);
		return aBook;
	}*/

	@Override
	public Book findById(Long id) {
		// TODO Auto-generated method stub
		//Book aBook = this.bookRepository.findOne(id);
		//return aBook;
		return this.bookRepository.findOne(id);
	}

}
