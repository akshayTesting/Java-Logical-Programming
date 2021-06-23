import java.util.Scanner;

public class Palimdrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Here Your Palimdrome");
		int num=sc.nextInt();
		int value=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=(reverse*10)+digit;
			num = num / 10;
		}
		if (value==reverse)
		{
		
			System.out.println("This is Palimdrome"+" "+reverse);
		}
		else
		{
			System.out.println("This Is Not A Palimdrome Number "+" "+reverse);
		}
		

	}

}
