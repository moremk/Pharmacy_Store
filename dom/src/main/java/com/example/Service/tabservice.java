package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;
import com.example.Repository.UserRepository;


@Service
public class tabservice {
	
	@Autowired
	 private UserRepository repo;
	 
	 public List<User>findAll() {
		return repo.findAll();
		}

	public void save(User user) {
	 repo.save(user);
		
	}

}
