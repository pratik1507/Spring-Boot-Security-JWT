package com.jwt.example.controllers;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.models.User;
import com.jwt.example.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
	private UserService userService;
    
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/test")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing";
    }
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("getting users");
		return this.userService.getUsers();
	}
	
	@GetMapping("/currentuser")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}


}
