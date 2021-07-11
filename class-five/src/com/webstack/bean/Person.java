package com.webstack.bean;

public class Person {
	private String name;
	private String adharCard;
	private int age;
	
	protected String mobileNo; //can  be aceess by child class.
	
	int x = 111;

	public Person() {
		System.out.println("Person Object created...!");
	}
	
	public Person(String name,String adharCard,int age) {
		this.name = name; 
		this.adharCard = adharCard;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.print(this.name + " " + this.adharCard + " " + this.age +" ");
	}

}
