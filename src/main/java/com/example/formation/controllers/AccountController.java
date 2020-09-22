package com.example.formation.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.formation.models.Account;
import com.example.formation.repositories.AccountRepository;

@RestController
@RequestMapping(path="/api")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping(path="/signup")
	public String createAccount(@RequestBody Account account) {
		try {
			accountRepository.save(account);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ok";
	}
	

}
