package Array2D;

public class Demo {
public static void main(String[] args) 
{

	int arr[][]=new int[3][4];
		arr[0][1]=8;
		arr[0][3]=4;
		arr[1][0]=2;
		arr[1][2]=3;
		arr[2][0]=5;
		arr[2][2]=4;
		arr[2][3]=7;
	
	//	System.out.println(  arr[1][2]  );  //3
		//System.out.println(  arr[2][3]  );  //7
		
		
		//row
		for (int i = 0; i < arr.length; i++)
		
		//coloum
			for (int j = 0; j <arr[i] .length; j++)
			{
			System.out.print(arr[i][j]+"   ");	
			}
		System.out.println();
		
		
}
}
