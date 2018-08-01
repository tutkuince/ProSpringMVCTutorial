package io.spring.tutorial.part07.dao;

import java.util.List;

import io.spring.tutorial.part07.model.Account;

public interface AccountDAO {
	void addAccount(Account account, boolean vipFlag);
	
	boolean doWork();
	
	List<Account> findAccounts();
}
