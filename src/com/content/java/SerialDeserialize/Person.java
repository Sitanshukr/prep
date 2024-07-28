package com.content.java.SerialDeserialize;

public class Person {
	
	
	
	private int age;
	private String name;
	private String socialSecurity;
	
	public Person(int age, String name, String socialSecurity) {
		super();
		this.age = age;
		this.name = name;
		this.socialSecurity = socialSecurity;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

}
