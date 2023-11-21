package com.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankingApp.enums.Role;
import com.BankingApp.model.BankExecutive;
import com.BankingApp.model.User;
import com.BankingApp.service.BankExecutiveService;
import com.BankingApp.service.UserService;



@RestController
public class BankExecutiveController {
	
	@Autowired
	private BankExecutiveService bankExecutiveService;
	
	@PostMapping("/bankExecutive/add")
	public BankExecutive postBankExecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user =bankExecutive.getUser();
		user.setRole(Role.EXECUTIVE);
		user=UserService.postUser(user);
		return bankExecutive; 
	}

	
	
	

}
