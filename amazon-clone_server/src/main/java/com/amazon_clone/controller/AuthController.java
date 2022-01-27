package com.amazon_clone.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon_clone.dto.RegisterRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	
	public void signup(@RequestBody RegisterRequest registerRequest) {
		
	}
}
