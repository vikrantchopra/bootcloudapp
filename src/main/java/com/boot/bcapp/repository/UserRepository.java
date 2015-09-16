package com.boot.bcapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.bcapp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUsername(String username);
}
