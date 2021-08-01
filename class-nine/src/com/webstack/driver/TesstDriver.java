package com.webstack.driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TesstDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> rollNumbersList = new ArrayList<Integer>();
		List<Integer> rollNumbersList = new LinkedList<Integer>();
		
		
		rollNumbersList.add(27);
		rollNumbersList.add(26);
		rollNumbersList.add(32);
		rollNumbersList.add(44);
		rollNumbersList.add(44);
		rollNumbersList.add(28);
		
		System.out.println("Number of Students : "+rollNumbersList.size());
		
		System.out.println("Display with Simple For Loop...!");
		for(int i=0;i<rollNumbersList.size();i++) {
			System.out.println(rollNumbersList.get(i));
		}
		
		
		System.out.println("Display with ForEach Loop...!");
		for(Integer rollNo : rollNumbersList) {
			System.out.println(rollNo);
		}
				
		
		System.out.println("Display with Lamda ForEach...!");
		rollNumbersList.stream().forEach(rollNo->System.out.println(rollNo));
		
		rollNumbersList.add(3, 54);
		
		System.out.println("Display with Lamda ForEach After add at 3rd position...!");
		rollNumbersList.stream().forEach(rollNo->System.out.println(rollNo));
		
		List<String> names = new ArrayList<String>();
		names.add("Keyur");
		names.add("denish");
		names.add("vinit");
		names.add("hiren");
		names.add("ravi");
		
		System.out.println("Display Names List with Lamda ForEach...!");
		names.stream().forEach(name->System.out.println(name));
		
		names.remove("hiren");
		
		System.out.println("Display Names List with Lamda ForEach After Remove...!");
		names.stream().forEach(name->System.out.println(name));
		
		names.set(3, "vikash");
		
		System.out.println("Display Names List with Lamda ForEach After Update...!");
		names.stream().forEach(name->System.out.println(name));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name for Search : ");
		String searchStr = sc.next();
		
		if(names.contains(searchStr)) {
			System.out.println(searchStr +" Found in Names List...!");
		}else {
			System.out.println(searchStr +" Not Found in Names List...!");
		}
		
		names.clear();
		
		System.out.println("After Clear List : "+names.size());
		
	}

}
