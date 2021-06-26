import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		String name = "Keyursinh Thakor";
		
		System.out.println("My Name Is : "+name);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Any Name : ");
		
		name = sc.next();
		
		System.out.print("Enter your Age : ");
		
		int age = sc.nextInt(); 
		
		System.out.println("Input Name is : "+name);
		
		System.out.println("Input Age is :  "+age);
	}

}


