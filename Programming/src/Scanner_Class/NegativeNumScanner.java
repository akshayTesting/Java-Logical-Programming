package Scanner_Class;

import java.util.Scanner;

public class NegativeNumScanner 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Here Number");
	double num=sc.nextInt();
	if(num>0)  // Number is Greater then zero
	{
		System.out.println("Enter Number Is "+num+" Positive ");
	}
	else
	{
		System.out.println("Enter Number Is "+num+" Negative ");

	}
	  sc.close();    
	}
}
