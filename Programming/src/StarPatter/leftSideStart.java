package StarPatter;

public class leftSideStart {

	public static void main(String[] args)
	{
		System.out.println("program start");
		int star=1;
		int line=5;
		for (int i = 0; i <=line; i++)
		{
		for (int j = 0; j <=star; j++)
		{
		System.out.print("*");	
		}	
		System.out.println();
		star++;
		}
		
		System.out.println("progaram end");

	}

}
