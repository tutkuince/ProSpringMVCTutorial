package io.spring.tutorial.part07.dao;

import org.springframework.stereotype.Component;

import io.spring.tutorial.part07.model.Account;

@Component
public class AccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount(Account account) {
		System.out.println(getClass() + ": Doing my db work: adding an account");
	}

}
