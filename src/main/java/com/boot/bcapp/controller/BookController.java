package com.boot.bcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.bcapp.model.Book;
import com.boot.bcapp.service.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	protected BookService bookService;
	
	@RequestMapping(value = "booklist", method = RequestMethod.GET)
	public String bookList(Model model) {
		model.addAttribute("books", this.bookService.showBooklist());
		return "booklist";
	}
	
	@RequestMapping(value = "new")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
	    return "bookform";
	}
	
	@RequestMapping(value = "addbook", method = RequestMethod.POST) 
	public String saveBook(Book book) {
		this.bookService.addBook(book);
		
		return "redirect:booklist";
	}
	
	@RequestMapping("edit/{bookId}")
	public String editBook(@PathVariable Long bookId, Model model) {
		model.addAttribute("book", this.bookService.findById(bookId));
		return "bookform";
	}
	
	@RequestMapping(value = "/delete/{bookId}")
    public String deleteBook(@PathVariable Long bookId, Model model) {
		this.bookService.deleteBook(bookId);
		//model.addAttribute("books", this.bookService.showBooklist());
		return "redirect:/book/booklist";
    }
	
	/*@RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String bookDelete(@RequestParam Long bookId) {
		this.bookService.deleteBook(bookId);
		//model.addAttribute("books", this.bookService.showBooklist());
		return "redirect:booklist";
    }*/
}
