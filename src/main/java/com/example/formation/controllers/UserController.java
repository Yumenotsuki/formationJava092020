package com.example.formation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.formation.models.User;
import com.example.formation.repositories.UserRepository;

@RestController
@RequestMapping(path="/api")
public class UserController {
	
	@Autowired 
	UserRepository userRepository;
	
	@GetMapping(path="/profile")
	public List<User> getprofile() {
		return userRepository.findAll();
	}

}
