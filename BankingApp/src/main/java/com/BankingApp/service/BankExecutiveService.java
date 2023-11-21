package com.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.repository.BankExecutiveRepository;

@Service
public class BankExecutiveService {
	
	@Autowired
	private BankExecutiveRepository bankExecutiveRepository;

	

}

