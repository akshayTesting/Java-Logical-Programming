package StarPatter;

public class TwoTrangleLeft {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int line=5;
		int starCount=1;
		int space=4;
		int mid=(line+1)/2;
		for (int i = 1; i <=line; i++)
		{
			for (int j = 1; j <=starCount; j++)
			{
			
				System.out.print("*");
			}
		
			for (int l = 1; l <=space; l++)
			{
			 System.out.print(" ");	
			}
			for (int k = 1; k <=starCount; k++)
			{
			
				System.out.print("*");
			}
			System.out.println();
			if (i<mid)
			{
			
				starCount++;
				
				space--;
			}
			else
			{
				starCount--;
				space++;
			}
		}
		

	}

}
