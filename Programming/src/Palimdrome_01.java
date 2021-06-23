import java.util.Scanner;

public class Palimdrome_01 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR PALIMDROME");
		int num=sc.nextInt();
		int value=num;
		int reverse=0;
		// A palindromic number is a number that remains the same when its digits are reversed
		while(num!=0)
		{
			int digits=num %10;
			reverse=(reverse*10)+digits;
			num=num/10;
			
		}
		if (value==reverse)
		{
		
			System.out.println("THIS PALIMDRIOME "+" "+reverse);
		}
		else {
			System.out.println("THIS NOT PALIMDROM"+" "+reverse);
		}

	}

}
