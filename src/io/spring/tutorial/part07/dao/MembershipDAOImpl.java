package io.spring.tutorial.part07.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAOImpl implements MembershipDAO {

	@Override
	public boolean addMember() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}

	@Override
	public void goToSleep() {
		System.out.println(getClass() + ": I'm going to sleep now...");
	}
}
