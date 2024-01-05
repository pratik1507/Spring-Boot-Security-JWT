package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

@Service
public class UserService {
	private List<User> list=new ArrayList<>();
	
	public UserService() {
		list.add(new User(UUID.randomUUID().toString(),"Pratik","pratik@gamil.com"));
		list.add(new User(UUID.randomUUID().toString(),"Sanket","sanket@gamil.com"));
		list.add(new User(UUID.randomUUID().toString(),"Omkar","omkar@gamil.com"));
		list.add(new User(UUID.randomUUID().toString(),"Aryan","aryan@gamil.com"));
	}
	public List<User> getUsers(){
		return this.list;
	}
}