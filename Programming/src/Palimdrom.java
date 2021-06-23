import java.util.Scanner;
import java.*;

public class Palimdrom {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number Here");
		int num=sc.nextInt();
		int value=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=(reverse*10)+digit;
			num=num/10;
		}
		if (value==reverse)
		{
		System.out.println("Entered No Is Palimdrom = "+reverse);	
		}
		else
		{
			System.out.println("Entered No Is Not Palimdrom = "+reverse);
		}
	}
}
