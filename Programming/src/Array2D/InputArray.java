package Array2D;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 2D array size : ");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row size : ");

		int rows = sc.nextInt();

		System.out.print("Enter column size : ");

		int columns = sc.nextInt();

		System.out.println("Enter array elements : ");

		int twoD[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				twoD[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < twoD.length; i++) 
		{
			for (int j = 0; j < twoD[i].length; j++) 
			{
				System.out.print(twoD[i][j] + " ");

			}
			System.out.println();

		}
	}

}
