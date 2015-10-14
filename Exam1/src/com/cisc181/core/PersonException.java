package com.cisc181.core;

public class PersonException extends Exception {
	public Person Person;
	public int age;
	
	
	public PersonException(int age) {
		this.age = age;
	}
	public Person getPerson() {
		return Person;
	}
	public int getAge() {
		return age;
	}

}
