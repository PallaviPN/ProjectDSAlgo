import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		System.out.println("Enter any string of your choice");
		Scanner sc=new Scanner(System.in);
		
		String S1= sc.nextLine();
		System.out.println("The String you entered is \n" + S1);
		
	*/
		
		// calculate percentage of a given student, his marks from 5 subjects is taken as input from the user
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your marks for the first subject");
		int sub1 = sc1.nextInt();
		System.out.println("Enter your marks for the second subject");
		int sub2=sc1.nextInt();
		System.out.println("Enter your marks for the third subject");
		int sub3=sc1.nextInt();
		System.out.println("Enter your marks for the fourth subject");
		int sub4=sc1.nextInt();
		System.out.println("Enter your marks for the fifth subject");
		int sub5=sc1.nextInt();

		float percentage = ((sub1+sub2+sub3+sub4+sub5) *100 )/ 500;
		System.out.println("Your percentage is " + percentage);
		
	}

}
