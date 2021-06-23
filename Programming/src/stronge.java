import java.util.Scanner;

public class stronge {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number Here");
		int num=sc.nextInt();
		int value=num;
		int sum=0;
		
		while (num!=0)
		{
		
			int digit=num%10;
			int fact=factorial(digit);
			sum=sum+fact;
			num=num/10;
		}
		if (value==sum)
		{
		System.out.println("This is stronge number");	
		}
		else
		{
			System.out.println("not strone number");
		}

	}
	
	public static int factorial(int digit)
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
