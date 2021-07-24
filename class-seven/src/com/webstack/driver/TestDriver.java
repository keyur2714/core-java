package com.webstack.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestDriver {

	public static void main(String[] args) {

		String str = "sachin";
		
		int a[]=new int[5];
		
		//try {
		//	FileInputStream f = new FileInputStream("aa.txt");
		//} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
		//	e1.printStackTrace();
		//}
		

		try {
			System.out.println("Length of String is : " + str.length());
			for(int i=0;i<a.length;i++) {
				a[i]=i+1;
			}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			//System.out.println(a[6]);//
			System.out.println("===========");
			int x = 10/2;
			System.out.println(x);
			String data = "123";
			int k = Integer.parseInt(data);
			System.out.println(k);
			//return; //Finally will be executed
			System.exit(0);//only in this case Finally Block will not execute
		} catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException  ex) {
			System.out.println("Exception  : " + ex.getMessage());
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Exception : " + ex.getMessage());
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			System.out.println("Always Executed...!");
		}

		System.out.println("Done...");

	}

}
