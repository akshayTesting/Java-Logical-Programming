import java.util.Scanner;

public class Practices_Stronge_Number
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number Here");
		int num=sc.nextInt();
		int sum=0;
		int value=num;
		while (num!=0)
		{
		
			int digit=num%10;
			int fact=factor(digit);
			sum=sum+fact;
			num=num/10;
		}
		if (value==sum)
		{
		System.out.println("stronge number");	
		}
		else
		{
			System.out.println("not stronge number");
		}
		
}
	
	
	public static int factor(int digit)
	{
		int fact=1;
		while (digit!=0)
		{
			 fact=fact*digit;
			 digit--;
		}
		return fact;
	}
}
