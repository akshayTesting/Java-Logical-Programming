
public class pluzzle
{
public static void main(String[] args)
{

	
	System.out.println("program start");
	
	for (int i = 0; i <=15; i++)
	{
	if (i%3==0 && i%5==0)
	{
	System.out.println("Fuzz & Buzz");	
	}	
	else if (i%3==0)
	{
	System.out.println("Fuzz");	
	}
	else if (i%5==0)
	{
	System.out.println("Buzz");	
	}
	}
	System.out.println("Program end");
}
}
