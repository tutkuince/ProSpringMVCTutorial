package io.spring.tutorial.part04;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String gender;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private List<String> genderList;

	public List<String> getGenderList() {
		return genderList;
	}

	public Student() {
		genderList = new ArrayList<>();
		genderList.add("Female");
		genderList.add("Male");
		genderList.add("Other");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
