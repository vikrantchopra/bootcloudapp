package com.boot.bcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.bcapp.service.UserService;

public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/userlist"}, method = RequestMethod.GET)
	public String showAllBooks(Model model) {
		model.addAttribute("books", this.userService.showUserlist());
		return "userlist";
	}
}
