package Array2D;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a[]= new int [3][];      //declaring the rows 
		
		/*	a[0]=new int[]{1,2,3};       //initialize the columns 
			a[1]=new int [] {4,5,6,7,8};
			a[2]=new int[] {9,10};
			
		*/
			
			a[0]=new int[2];          //declaring the columns
			a[1]=new int [5]; 
			a[2]=new int[1] ;
			
			a[0][1]=10;              // initializing the value 
			a[0][0]=11;
			
		//	int [][]a= {{1,2,3,4},{5,6,7,8},{10,11,12,13}};  //declaring and intialzation 
			
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a[i].length; j++) 
				{
					System.out.print(a[i][j] + " ");
				}
				
				System.out.println();

			}
			
			
	}

}
