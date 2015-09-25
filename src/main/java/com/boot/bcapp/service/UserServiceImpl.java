package com.boot.bcapp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.boot.bcapp.model.User;
import com.boot.bcapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	protected UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		User aUser = user;
		this.userRepository.save(aUser);

	}

	@Override
	public Iterable<User> showUserlist() {
		return this.userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User getUserByEmail(String email) {
		//return userRepository.findByUsername(email);
		return this.userRepository.findByUsername(email); 
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

}
