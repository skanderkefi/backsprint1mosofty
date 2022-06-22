package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Login;
import com.example.entities.User;
import com.example.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	 
	public Boolean login(Login login) {
		
		User user =  repo.findByMailAddress(login.getMailAdress());
		System.out.println("user from db" + user);
		if(user != null) {
			if(user.getPassword().equals(login.getMdp())) 
				return true;
			else return false;
		}else return false;
	
		
	}

}
