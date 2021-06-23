package StarPatter;

public class Trangle 
{
public static void main(String[] args) 
{

	int line=5;
	int starcount=1;
	int space=4;
	for (int i = 0; i <=line; i++)
	{
		for (int j = 0; j <=space; j++)
		{
		System.out.print(" ");	
		}
		for (int k = 0; k <=starcount; k++)
		{
		System.out.print("*");	
		}
		System.out.println();
		starcount=starcount+2;
		space--;
	}
}
}
