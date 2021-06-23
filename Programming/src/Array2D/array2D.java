package Array2D;

public class array2D {

	public static void main(String[] args)
	{

		int arr[ ] []=new int[6][2];
		arr[0][0]=5;
		arr[0][1]=10;
		arr[1][0]=15;
		arr[1][1]=20;
		arr[2][0]=25;
		arr[2][1]=30;
		arr[3][0]=35;
		arr[3][1]=40;
		arr[4][0]=45;
		arr[4][1]=50;
		
		
		
		for (int i = 0; i < arr.length; i++)
		{
		for (int j = 0; j < arr[i].length; j++) 
		{
		System.out.println(arr[i][j]+"  ");	
		}	
		System.out.println();
		}
		
	}

}
