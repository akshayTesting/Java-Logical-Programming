import java.util.Scanner;

public class Fibonacies {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Here");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int limit=1;
		while (limit<=num)
		{
		
			c=a+b;
			System.out.print(c+" ,");
			a=b;
			b=c;
			limit++;
		}
	}

}
