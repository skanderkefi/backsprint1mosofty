package com.example.servicesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.entities.Login;
import com.example.entities.User;
import com.example.repo.UserRepo;
import com.example.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
class UserTestTest {
	
	@InjectMocks
	UserService service;

	@Mock
	UserRepo repo;
	
	
	
	@Test
	void testLogin_pass() {
		
		
		
		boolean exists;
		Login login = new Login("skanderkefi@esprit.tn", "azert");

//		User user =  repo.findByMailAddress(login.getMailAdress());
//		System.out.println("---------------"+user);
//		if(user != null) {
//			if(user.getPassword().equals(login.getMdp())) 
//				exists = true;
//			else exists = false;
//		}			else exists = false;
//
//	
		
		exists = service.login(login);
		Assert.assertEquals(true, exists);
		
	}

}
