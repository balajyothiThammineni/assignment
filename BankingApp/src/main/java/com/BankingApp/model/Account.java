package com.BankingApp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;
	private Double rateOfInterest;
	private String balance;
	
	@OneToOne
	private AccountDetails accountDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	
	
	
}
