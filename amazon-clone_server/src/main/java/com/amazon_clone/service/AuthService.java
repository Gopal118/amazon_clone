package com.amazon_clone.service;

import java.time.Instant;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.amazon_clone.dto.RegisterRequest;
import com.amazon_clone.entity.User;
import com.amazon_clone.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired UserRepository userRepository;
	
	
	@Transactional
	public void signup(RegisterRequest registerRequest) {
		User user = new User();
		
		user.setName(registerRequest.getUsername());
		user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
		user.setEmail(registerRequest.getEmail());
		user.setCreated_time(Instant.now());
		user.setStatusId(1L);
		userRepository.save(user);
		
		
		generateverificationToken(user);
	}


	private void generateverificationToken(User user) {
		// TODO Auto-generated method stub
		String verificationToken = UUID.randomUUID().toString();
		
	}

}
