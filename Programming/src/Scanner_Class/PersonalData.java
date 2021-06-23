package Scanner_Class;

import java.util.Scanner;

public class PersonalData
{

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=s.nextLine();
		System.out.println("Enter Your Age:");
		double age=s.nextDouble();
		System.out.println("Enter Your Mobile Number");
		long mobile=s.nextInt();
		System.out.println("Your Gender");
		Scanner s1=new Scanner(System.in);
		String gender=s1.nextLine();
		System.out.println("Address");
		String address=s1.nextLine();
	
		
		
		System.out.println("==================================");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender :"+gender);
		System.out.println("Mobile Number : "+mobile);
		System.out.println("Address :"+address);
		
		
		
	}
}
