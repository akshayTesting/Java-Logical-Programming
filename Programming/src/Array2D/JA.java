package Array2D;

import java.util.Scanner;

public class JA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the num of rows");
		int a[][]=new int[S1.nextInt()][];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("enter the num of columns for "+ i +"rows");
			a[i]=new int[S1.nextInt()];
			
			
			System.out.println("enter the values for the "+ i +"row");
			for (int j = 0; j < a[i].length; j++)
			{	
				System.out.println("enter the values for the "+ i +"row"+j+"column");
				a[i][j]=S1.nextInt();				
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();
		}
	}

}
