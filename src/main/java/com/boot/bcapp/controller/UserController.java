package com.boot.bcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.bcapp.model.User;
//import com.boot.bcapp.model.User;
import com.boot.bcapp.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/userlist"}, method = RequestMethod.GET)
	public String showAllBooks(Model model) {
		model.addAttribute("users", this.userService.showUserlist());
		return "userlist";
	}
	
	@RequestMapping(value = "signup")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@RequestMapping(value = "signupSuccess", method = RequestMethod.POST) 
	public String saveUser(User user) {
		this.userService.addUser(user);
		
		return "signupSuccess";
	}
}
