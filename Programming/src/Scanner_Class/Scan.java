package Scanner_Class;

import java.util.Scanner;

public class Scan 
{
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter Your Number");
	int num=sc.nextInt();
	if (num>0)
	{
		
	System.out.println(num+" "+"Positve Number");
	}
	   else if(num < 0)
       {
           System.out.println("The given number "+num+" is Negative");
       }
       else
       {
           System.out.println("The given number "+num+" is neither Positive nor Negative ");
       }
}
}
