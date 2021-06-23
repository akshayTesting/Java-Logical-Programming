package Array2D;

import java.util.Iterator;
import java.util.Scanner;

public class INPUTARRAy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("This is Input Array");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Row Size");
	int row=sc.nextInt();
	System.out.println("Enter Coloum size");
	int coloum=sc.nextInt();
	System.out.println("Enter Elements");
	int TwoD[][]=new int [row][coloum];
	for (int i = 0; i <row; i++)
	{
	for (int j = 0; j <coloum; j++)
		{
		TwoD[i][j]=sc.nextInt();
		}
	}
for (int i = 0; i < TwoD.length; i++) 
{
	for (int j = 0; j < TwoD[i].length; j++)
	{
		System.out.print(TwoD[i][j]+"       ");
	}
	System.out.println();
   	
}	
		
	}

}
