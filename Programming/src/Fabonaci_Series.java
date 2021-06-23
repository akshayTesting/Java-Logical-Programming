import java.util.Scanner;

public class Fabonaci_Series 
{

	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your End limit of Fabonaci Series  ");
	int limit=sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	for (int i = 1; i <=limit; i++)
	{
	 System.out.print(a+" "+" ,");
	 c=a+b;
	 a=b;
	 b=c;
		
	}
	System.out.println("\n end");
	}
}
