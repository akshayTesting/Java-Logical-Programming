package StarPatter;

public class RerverseTrangle 
{

	
	public static void main(String[] args) 
	{
	
		int StarCount=5;
		int line=5;
		int space=0;
		for (int i = 1; i <=line; i++)
		{
		
			for (int j = 1; j <=space; j++) 
			{
			System.out.print(" ");	
			}
			for (int j = 1; j <=StarCount; j++)
			{
			System.out.print("*");	
			}
			System.out.println();
			StarCount=StarCount-2;
			space++;
		}
	}
}
