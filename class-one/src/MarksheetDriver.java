import java.util.Scanner;

public class MarksheetDriver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First Subject Mark : ");
		int sub1 = scanner.nextInt();
		
		System.out.print("Enter Second Subject Mark : ");
		int sub2 = scanner.nextInt();
		
		System.out.print("Enter Third Subject Mark : ");
		int sub3 = scanner.nextInt();
		
		System.out.print("Enter Fourth Subject Mark : ");
		int sub4 = scanner.nextInt();
		
		System.out.print("Enter Fifth Subject Mark : ");
		int sub5 = scanner.nextInt();
		
		System.out.print("Enter Six Subject Mark : ");
		int sub6 = scanner.nextInt();
		
		System.out.println("Subject 1 Marks : "+sub1);
		
		System.out.println("Subject 2 Marks : "+sub2);
		
		System.out.println("Subject 3 Marks : "+sub3);
		
		System.out.println("Subject 4 Marks : "+sub4);
		
		System.out.println("Subject 5 Marks : "+sub5);
		
		System.out.println("Subject 6 Marks : "+sub6);
		
		int totalMarks = 0;
		float per = 0.0f;
		String grade = "";
		boolean isPass = false;
		
		totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		
		if(sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && sub4 >= 35 && sub5 >= 35 && sub6 >= 35) {
			isPass = true;
		}
		
		if(isPass) {
			per=totalMarks/6;
			if(per >= 0) {
				if(per >= 70) {
					grade = "Distinction";
				}else if(per >= 60) {
					grade = "First";
				}else if(per >= 50) {
					grade = "Second";
				}else if(per >= 35) {
					grade = "Pass";
				}
			}
		}else {
			per = 0.0f;
			grade = "FAIL";
		}

		System.out.println(" Total Marks : "+totalMarks);
		System.out.println(" Percentage : " + per);
		System.out.println(" Grade : "+ grade);
	}

}
