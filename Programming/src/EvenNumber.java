import java.util.Iterator;
import java.util.Scanner;

public class EvenNumber 
{
public static void main(String[] args) 
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No Here");
	int a=sc.nextInt();
	
	for (int i = 0; i <=50; i++)
	{
	if (i%2==0)
	{
	System.out.println("These are Even "+" "+i);	
	}	
	else
	{
		System.out.println("These are not Even "+" "+i);
	}
	}
}
}
