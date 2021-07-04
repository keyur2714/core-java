package com.webstack.driver;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		String friend1="Keyur";
		String friend2="denish";
		String friend3="vinit";
		
		int noOfFriends = 100;
		
		String friends[]=new String[noOfFriends];//Declaration of Array
		int rollNo[]=new int[5];
		
		System.out.println(friend1+" "+friend2+" "+friend3);
		
		friends[0]="sachin0";
		friends[1]="sachin1";
		friends[2]="sachin2";
		friends[3]="sachin3";
		friends[4]="sachin4";
		
		System.out.println(friends.length);
		
		System.out.println(friends[0]+" "+friends[1]+" "+friends[2]+" "+friends[3]+" "+friends[4]);
		
		for(int i=0;i<friends.length;i++) {
			friends[i]="sachin "+i;
		}
		
		for(int i=0;i<friends.length;i++) {
			System.out.println(friends[i]);
		}
		
		for(int i=0;i<rollNo.length;i++) {
			rollNo[i]=i+1;
		}
		
		for(int i=0;i<rollNo.length;i++) {
			System.out.println("Roll No: "+rollNo[i]);
		}
		
		System.out.println("==============");
		
		int x[] = {11,33,44,22,55,33,11,55,11,6};
		
		System.out.println("============Length of X "+x.length);
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
				
		int element = 500;
		int pos = 3;
		int y[] = new int[x.length+1];
		y[10]=x[9];
		y[9]=11;
		y[8]=55;
		y[7]=11;
		y[6]=33;
		y[5]=500;
		
		for(int i=0;i<x.length;i++) {
			y[i]=x[i];
		}
		
		System.out.println("==============Array Y============");
		
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}
		
		for(int i=y.length-1;i>pos;i--) {			
				y[i]=x[i-1];			
		}
		
		y[pos]=element;
		
		System.out.println("==============New Array Y============");
		
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}
		
		
	}

}
