package com.vinilimadev.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinilimadev.workshopmongo.domain.User;
import com.vinilimadev.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		
		return repo.findAll();
		
	}

}
