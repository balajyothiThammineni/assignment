package com.BankingApp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@CreationTimestamp
	private LocalDateTime dateOfCreation;
	
	@OneToOne
	private AccountHolder accountHolder;
	@OneToOne
	private BankExecutive bankExecutive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public LocalDateTime getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(LocalDateTime dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public BankExecutive getBankExecutive() {
		return bankExecutive;
	}
	public void setBankExecutive(BankExecutive bankExecutive) {
		this.bankExecutive = bankExecutive;
	}
	
	


}
