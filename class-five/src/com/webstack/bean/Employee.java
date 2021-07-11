package com.webstack.bean;

public class Employee extends Person {

	private String empId;
	private Long salary;
	
	public Employee() {} //this is mandatory if we have another parameterized constroctor in class
	
	public Employee(String mobileNo) {
		this.mobileNo = mobileNo;	
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(this.empId+ " " + this.salary+ " " +this.mobileNo);
	}

}
