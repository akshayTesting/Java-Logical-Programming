package Scanner_Class;

import java.util.Scanner;

public class UsernamePassword
{

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your UserName ");
		String Name=sc.nextLine();
		Scanner sc1=new Scanner(System.in);

		System.err.println("Enter Your Password");
		String pass=sc1.nextLine();
		String username="Facebook";
		String password="Java";
		if (Name.equals(username) && pass.equals(password)) 
		{
			System.out.println("Login Succesfull");
		}
		else
		{
			System.out.println("Invalid Username & Password");
		}
	}
}
