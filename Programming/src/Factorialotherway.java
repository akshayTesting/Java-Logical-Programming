import java.util.Scanner;

public class Factorialotherway {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter here value");
		int num=sc.nextInt();
		int i=1;
		int Result=1;
		while (i<=num)
		{
		Result=Result*i;
		i++;
		}
		System.out.println("Factorial of "+num+" is ="+Result);
		
	}
}
