import java.util.Scanner;

public class Series_No {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number Limit");
		int limit=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for (int i = 0; i <=limit; i++)
		{
		 a=b;
		 b=c;
		 c=a+b;
		 System.out.print(a+" "+" ,");
		}

	}

}
