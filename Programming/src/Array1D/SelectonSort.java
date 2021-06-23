package Array1D;

import java.util.Scanner;

public class SelectonSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int a[] = new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		// selection sort
		for (int i = 0; i < a.length-1; i++)// i = 4 , 4 < 4 (F) 				// 2 3 5 6 7
																				// 0 1 2 3 4
		{
			int min = a[i]; // min = 7 //  a[3]
			int min_ind = i;// min_ind = 3
			for (int j = i+1; j < a.length; j++) // j = 4    4 < 5 (T)
			{
				if(min > a[j])  // 7 > 6  (T)
				{
					min = a[j]; // min = 6		a[4]
					min_ind = j;// min_ind = 4
				}
			}
			if(i != min_ind) // 3  != 4  (T)
			{
				int temp = a[i];
				a[i] = a[min_ind];
				a[min_ind] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
