package com.webstack.dto;

public class EmployeeDTO {

	private Integer empId;
	private String name;
	private String designation;
	private String deptName;
	private Double salary;
	
	//Default Constructor 
	public EmployeeDTO() {
		System.out.println("Employee Object Created...!");
	}
	
	public EmployeeDTO(Integer empId,String name,String designation,String deptName,Double salary) {
		System.out.println("Employee Object Created...!");
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.deptName = deptName;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println(this.getEmpId()+ " "+this.getName()+" "+this.getDesignation()+" "+this.getDeptName()+ " "+this.getSalary());
	}
}
