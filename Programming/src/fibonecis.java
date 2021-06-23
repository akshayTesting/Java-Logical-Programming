import java.util.Scanner;

public class fibonecis 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value Here");
		int limit=sc.nextInt();
		
		int a=0; int b=1; int c=0;
		int i=1;
		System.out.print(a+",");
		System.out.print(b+",");
		while(i<=limit)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			i++;
		}
		
		
	}
}
