package Array2D;

import java.util.Scanner;

public class inputArray1 
{
public static void main(String[] args)
{
System.out.println(" 2D diamentions Array");
Scanner sc=new Scanner(System.in);
System.out.println("Enter Row size");

int row=sc.nextInt();
System.out.println("Enter Coloum Size");
int col=sc.nextInt();
System.out.println("Enter Your Array Element");
int TwoD[][]=new int [row][col];
for (int i = 0; i < TwoD.length; i++) 
{
	for (int j = 0; j < TwoD.length; j++) 
		{
	TwoD[i][j]=sc.nextInt();
		}
	}


	for (int i = 0; i < TwoD.length; i++) 
	{
		for (int j = 0; j < TwoD[i].length; j++)
		{
		System.out.print(TwoD[i][j]);	
		}
		System.out.println();
	}

}
}
