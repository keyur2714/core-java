package com.webstack.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.webstack.util.InvalidEmailException;
import com.webstack.util.InvalidFileNameException;

public class TestDriver {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Email : ");
		try {
			String email = scanner.next();
			if(email != null && email.indexOf("@") == -1) {
				throw new InvalidEmailException("Invalid Email Address");
			}
			System.out.println("Email Address Is : " + email);
		}catch(InvalidEmailException e) {
			System.out.println(e.getErrorMessage()+" : "+e.getErrorCode());
		}
		finally {
			System.out.println("Always Executed...!");
		}
		
		System.out.println("Done...!");
		
		
		String fileName = "abc.txt";
		try (Scanner file = new Scanner(new File(fileName))) {
		    if (file.hasNextLine())
		        System.out.println(file.nextLine());	
		} catch (FileNotFoundException e) {
		    if (fileName.startsWith("a")) {
		    	try {
		    		throw new InvalidFileNameException("Incorrect filename : " + fileName );
		    	}catch(InvalidFileNameException ex) {
		    		System.out.println(ex.getErrorMessage()+ " " + ex.getErrorCode());
		    	}
		    }
		    //...
		}
		
		System.out.println("Done Again...!");
	}

}
