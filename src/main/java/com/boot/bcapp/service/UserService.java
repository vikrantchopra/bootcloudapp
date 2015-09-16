package com.boot.bcapp.service;

import com.boot.bcapp.model.User;

public interface UserService {
	
	public void addUser(User user);
	
	public Iterable<User> showUserlist();
}
