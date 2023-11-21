package com.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.model.Account;
import com.BankingApp.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public Account postAccount(Account account) {
		return accountRepository.save(account);
	}

}
