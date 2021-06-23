package Array1D;

public class Array {

	public static void main(String[] args) 
	{
		
		int arr[]=new int[11];
		arr[0]=1;
		arr[1]=3;
		arr[2]=2;
		arr[3]=4;
		arr[4]=6;
		arr[5]=5;
		arr[6]=7;
		arr[7]=6;
		arr[8]=8;
		arr[9]=10;
		arr[10]=9;
		System.out.println(arr);
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]);
		 * 
		 * }
		 */
		/*
		 * int a=10;
		 * 
		 * while (a>=0) { System.out.println(arr[a]); a--; }
		 */
		int b=5;
		do
		{
		System.out.println(arr[b]);	
		b--;
		} 
		while (b>=0);
		
		
	}

}
