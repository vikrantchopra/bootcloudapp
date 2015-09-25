package com.boot.bcapp.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.boot.bcapp.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//com.boot.bcapp.model.User user = this.userRepository.findByUsername(username);
		com.boot.bcapp.model.User user = this.userService.getUserByUsername(username);
		
		List<GrantedAuthority> authorities = buildUserAuthority(user.getRole());
		System.out.println("Username: " + user.getUsername() + " :: Password: " + user.getPassword());
		
		return new User(user.getUsername(), user.getPassword(), authorities);
	}
	
	private List<GrantedAuthority> buildUserAuthority(String role) {
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		setAuths.add(new SimpleGrantedAuthority(role))
;		return new ArrayList<GrantedAuthority>(setAuths);
	}

}
