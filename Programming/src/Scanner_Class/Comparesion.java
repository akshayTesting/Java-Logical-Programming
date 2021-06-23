package Scanner_Class;

import java.util.Scanner;

public class Comparesion
{

	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Your Name Here");
		String name=sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		String pass=sc.nextLine();
		String na="Java";
		String pa="Python";
		if (name.equals(na) && pass.equals(pa))
		{
		System.out.println("Welcome to aplication"+" "+name);	
		}
		else
		{
			System.out.println("Sorrry..!");
		}
	}
}
