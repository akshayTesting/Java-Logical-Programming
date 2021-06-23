package StarPatter;

public class leftStart 
{

	
	public static void main(String[] args) 
	{
	
		int star=1;
		int line=5;
		int mid=(line+1)/2;
		for (int i = 1; i <=line; i++)
		{
		
			for (int j = 1; j <=star; j++)
			{
			System.out.print("*");	
			}
			System.out.println();
			if (i<mid)
			{
			star++;
			}
			else
			{
				star--;
			}
		}
	}
}
