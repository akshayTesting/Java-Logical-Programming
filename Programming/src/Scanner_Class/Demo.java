package Scanner_Class;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Grade");
		char c=s.next().charAt(0);
		switch (c)
		{
		case 'A':
	System.out.println("Your Are in first class above 95");		
			break;
		case 'B':
			System.out.println("Your Are in second  class above 85");		
					break;
		case 'C':
			System.out.println("");		
					break;
		case 'D':
			System.out.println("Your Are in Fail class above 35");		
					break;
					

		default:
			System.out.println("Please Enter Your Grade Between A to D");
			break;
		}
		
	}
}
