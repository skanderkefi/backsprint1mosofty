package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.controller.UserController;
import com.example.entities.Login;
import com.example.entities.User;
import com.example.repo.UserRepo;
import com.example.service.UserService;

//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = UserController.class)
@SpringBootTest
public class IntegTest {
	
	 @Mock
	 private MockMvc mvc;
	 
	 @Mock
	 private UserService service;
	 
	 @Mock
	 private User user;
	 
	 @Autowired
	 TestRestTemplate testRestTemplate;

	 @Test
	 void hello() throws Exception{
		 
		 
		 user = new User("skanderkefi@esprit.tn", "azert");
		 
		 HttpEntity<User> request = new HttpEntity<>(user);
		 ResponseEntity<User> response = testRestTemplate.getForEntity("Login/connect", User.class);
		 
		 assertNotNull(response.getBody().getId());
		 assertEquals("skanderkefi@esprit.tn", response.getBody().getMailAddress());
		 assertEquals("azert", response.getBody().getPassword());
		 

		 
		 
	 }


	
}
