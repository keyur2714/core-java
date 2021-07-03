package com.webstack.driver;

import java.util.Scanner;

import com.webstack.dto.EmployeeDTO;

public class TestDriver {

	public static void main(String[] args) {
	
		System.out.println("Hello Radhe Krishna...!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Employee Id : ");
		Integer empId = scanner.nextInt();	
		
		System.out.print("Enter Employee Name : ");
		String empName = scanner.next();
		
		System.out.print("Enter Employe Designation : ");
		String designation = scanner.next();
		
		System.out.print("Enter Employe Department : ");
		String dept = scanner.next();
		
		System.out.print("Enter Employee Salary : ");
		Double salary = scanner.nextDouble();

		EmployeeDTO employee1 = new EmployeeDTO();
		
		employee1.setEmpId(empId);
		employee1.setName(empName);
		employee1.setDesignation(designation);
		employee1.setDeptName(dept);
		employee1.setSalary(salary);
		
		
		EmployeeDTO employee2 = new EmployeeDTO();
		employee2.setEmpId(26);
		employee2.setName("denish patel");
		employee2.setDesignation("IT Engineer");
		employee2.setDeptName("IT");
		employee2.setSalary(45444.5);
		
		
		EmployeeDTO employee3 = new EmployeeDTO();
		employee3.setEmpId(44);
		employee3.setName("vinit shah");
		employee3.setDesignation("Business Man");
		employee3.setDeptName("Texttile");
		employee3.setSalary(12211.8);
		
		//System.out.println(employee1.getEmpId()+ " "+employee1.getName()+" "+employee1.getDesignation()+" "+employee1.getDeptName()+ " "+employee1.getSalary());
		employee1.display();
		employee2.display();
		employee3.display();
		
		EmployeeDTO employee4 = new EmployeeDTO(54, "Piyush Vashi", "Software Eng", "IT", 50000.5);
		employee4.display();
	}

}
