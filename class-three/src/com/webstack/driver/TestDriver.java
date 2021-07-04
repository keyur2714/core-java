package com.webstack.driver;

import java.util.Scanner;

import com.webstack.dto.EmployeeDTO;

public class TestDriver {

	public static void main(String[] args) {
	
		System.out.println("Hello Radhe Krishna...!");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number of Employee : ");
		int noOfEmployee = scanner.nextInt();
		
		
		EmployeeDTO employee[]=new EmployeeDTO[noOfEmployee]; //Declaration of Array
		
		for(int i=0;i<employee.length;i++) {
			
			System.out.print("Enter Employee Id of employee["+i+"] : ");
			Integer empId = scanner.nextInt();	
			
			System.out.print("Enter Employee Name of employee["+i+"] : ");
			String empName = scanner.next();
			
			System.out.print("Enter Employe Designation of employee["+i+"] : ");
			String designation = scanner.next();
			
			System.out.print("Enter Employe Department of employee["+i+"] : ");
			String dept = scanner.next();
			
			System.out.print("Enter Employee Salary of employee["+i+"] : ");
			Double salary = scanner.nextDouble();
			
			employee[i]=new EmployeeDTO(empId, empName, designation, dept, salary);
		}
		
		System.out.println("============Display Employee=============");
		
		for(int i=0;i<employee.length;i++) {
			employee[i].display();
		}
		
		

		EmployeeDTO employee1 = new EmployeeDTO();
		
		employee1.setEmpId(27);
		employee1.setName("keyur");
		employee1.setDesignation("SE");
		employee1.setDeptName("IT");
		employee1.setSalary(44444.4);
		
		
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
