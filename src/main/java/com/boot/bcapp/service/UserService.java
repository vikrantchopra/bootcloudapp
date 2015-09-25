package com.boot.bcapp.service;

import com.boot.bcapp.model.User;

public interface UserService {
	
	public void addUser(User user);
	
	public Iterable<User> showUserlist();
	
	public User getUserById(long id);
	
	public User getUserByEmail(String email);
	
	public User getUserByUsername(String username);
}
