package io.spring.tutorial.part07.dao;

import org.springframework.stereotype.Component;

import io.spring.tutorial.part07.model.Account;

@Component
public class AccountDAOImpl implements AccountDAO {

	private String name;
	private String serviceCode;

	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}

	@Override
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": Doing my db work: adding an account");
	}

	@Override
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;
	}

}
