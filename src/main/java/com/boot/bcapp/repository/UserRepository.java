package com.boot.bcapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.bcapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUsername(String username);
}
