package com.webstack.driver;

import com.webstack.bean.Employee;
import com.webstack.bean.Student;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		Student student = new Student("9898012121");
		student.setName("Shubham");
		student.setAdharCard("112233445566");
		student.setAge(26);
		student.setRollNo("OO123A");
		student.setStd("12");
		
		//student.x = 1; //not accesible as it's default and out side package we try to access
		
		//System.out.println(student.getName() + " " + student.getAdharCard() + " " + student.getRollNo() + " " + student.getStd() + " " + student.getAge());
		student.display();
		
		System.out.println();
				
		
		Employee employee = new Employee("7387223311");
		employee.setName("Sachin");
		employee.setAge(35);
		employee.setAdharCard("332211223344");
		employee.setEmpId("E112233");
		employee.setSalary(444444l);
		
		
		
		//System.out.println(employee.getName() + " " + employee.getAdharCard() + " " + employee.getEmpId() + " " + employee.getSalary() + " " + employee.getAge());
		employee.display();
	}

}
