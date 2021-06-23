import java.util.Scanner;

public class Leap_Year
{

	public static void main(String[] args) 
	{
	
		// in AND bitwise oprator when both condition are satisfied then it will true otherwise false
		
		//In OR bitwise oprator when both condition are Not satisfied then it will true otherwise false
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Year");
		int year=sc.nextInt();
		int fact=1;

		if ((year%4==0||year%400==0)&&(year%100!=0))
		{
		System.out.println(year+" "+"This is Leap Year");	
		}
		else
		{
			System.out.println("This is not a leap year"+" "+year);
		}
	}
}
