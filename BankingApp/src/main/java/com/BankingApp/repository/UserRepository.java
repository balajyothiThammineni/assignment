package com.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankingApp.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

}
