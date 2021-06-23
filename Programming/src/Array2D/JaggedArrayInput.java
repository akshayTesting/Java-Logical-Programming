package Array2D;

import java.util.Scanner;

public class JaggedArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		
		int n=kb.nextInt();
		int [] [] arr=new int[n] [] ;
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("Enter the number of columns in row number " +(i+1)+": ");
		
		int cl=kb.nextInt();
		
		arr[i]=new int[cl] ;
		
		System.out.println(" Enter "+cl+" values :") ;
		
		for(int j=0;j<arr[i].length;j++)
		{
		arr[i] [j] =kb.nextInt();
		}
		}
		
		
		System.out.println(" Output of  jagged array is ") ;

		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + " ");

			}
			
			System.out.println();
	}

}
}
