import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int a=2;
			while (a<=num)
			{
			if (num%a==0)
			{
			break;	
			}	
			a++;
			}
			if (a==num)
			{
			System.out.println("prime");	
			}
			else {
				System.out.println("not prime");
			}

	}

}
