package com.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.model.User;
import com.BankingApp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private static  UserRepository userRepository;

	public static User postUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
}
