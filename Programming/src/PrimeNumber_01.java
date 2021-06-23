import java.util.Scanner;

public class PrimeNumber_01 {

	public static void main(String[] args)
	{
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Your Number");
		int num=sc.nextInt();
		int count=1;
		for (int i = 1; i <=num/2; i++) 
		{
		
			if (num%i==0)
			{
			count++;	
			}
		}
		if (count==2)
		{
		System.out.println("Number is Prime"+" "+num);	
		}
		else {
			System.out.println("Number is Not Prime"+" "+num);	
		}

	}

}
