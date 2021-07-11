package com.webstack.bean;

public class Student extends Person {

	private String rollNo;
	private String std;

	public Student() {
		super("Vinit","AADDFF112233",35);
		System.out.println("Person is a Student...!" + this.x);		
	}
	
	public Student(String mobileNo) {
		super("Vinit","AADDFF112233",35);
		System.out.println("Person is a Student...!" + this.x);	
		this.mobileNo = mobileNo;
	}
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}
	
	@Override
	public void display() {
		super.display();//this will call parent class (Person class) display method.
		System.out.println(this.rollNo + " " + this.std + " " +this.mobileNo);		
	}

}
