import java.util.Scanner;

public class PatternDriver {

	public static void main(String[] args) {
		
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any String : ");
		str = sc.next();
		
		int length = str.length();
		
		System.out.println(str.charAt(2));
		
		System.out.println("Length of "+str+" is "+length);
		
		for(int i=1;i<=length;i++) {			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		System.out.print("Enter Any No : ");
		int no = sc.nextInt();
		
		System.out.println("Number is : "+no);
		
		for(int i=1;i<=no;i++) {
			System.out.print(i +" ");
		}
	}

}

//if no=7 i need output like 1 2 3 4 5 6 7

/*
 s
 sa
 sac
 sach
 sachi
 sachin
 */
