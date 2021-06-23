package StarPatter;

public class Diamand
{

	public static void main(String[] args) 
	{
	
		int line=5;
		int star=1;
		int space=2;
		int mid=(line+1)/2;
		for (int i = 1; i <=line; i++)
		{
		
			for (int j = 1; j <=space; j++)
			{
			
				System.out.print(" ");
			}
			for (int k = 1; k <=star; k++)
			{
			
				System.out.print("*");
			}
			System.out.println();
			if (i<mid)
			{
			star=star+2;
			space--;
			}
			else
			{
				star=star-2;
				space++;
			}
		}
	}
}
