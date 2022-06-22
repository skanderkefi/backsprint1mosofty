package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Login;
import com.example.entities.User;
import com.example.repo.UserRepo;
import com.example.service.UserService;

@RestController
@RequestMapping("/Login")
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
	UserRepo repo;
	
	@CrossOrigin
	@PostMapping("/connect")
	public  ResponseEntity<User> verifyUser(@Validated @RequestBody Login login) {
		boolean exist = service.login(login);
		System.out.println("booelan = " +exist);
		if(exist) 	
			
			{
			User userr = repo.findByMailAddress(login.getMailAdress());
			System.out.println("user from ctrl "+ userr);
			return new ResponseEntity<>(userr, HttpStatus.OK);}

		
		else {
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}
		
	
	}
}
