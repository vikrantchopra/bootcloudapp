package com.boot.bcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.bcapp.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
		
	@RequestMapping(value={"/book/booklist"}, method = RequestMethod.GET)
	public String showAllBooks(Model model) {
		model.addAttribute("books", this.bookService.showBooklist());
		return "booklist";
	}
}
