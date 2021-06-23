import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Number Here");
		int num=sc.nextInt();
		int value=num;
		int sum=0;
		while(num !=0)// 145 ! 0
		{
			int digit= num%10;
			int fact=factorial(digit);
			sum=sum+fact;
			num=num/10;
		}
		if (value==sum)
		{
		System.out.println("This Is Strong Number");	
		}
		else
		{
			System.out.println("This Is not stronge number");
		}
	}

	public static int factorial(int digit)
	{
		
	 int fact=1;
	 while(digit!=0)
	 {
		 fact=fact*digit;
		 digit--;
	 }
	return fact;
		
	}
}
