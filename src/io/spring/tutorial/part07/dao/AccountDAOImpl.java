package io.spring.tutorial.part07.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount() {
		System.out.println(getClass() + ": Doing my db work: adding an account");
	}

}
