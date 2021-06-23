package Array2D;

public class Array2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] b;
        //Rows,Columns
b=new int [2][3];     // [1,2,3]
                      //[4,5,6]
b[0][0]=100;
//	System.out.println(b[0][0]);
//	System.out.println(b.length);  //length of array = no of rows

                 //R,c
int[][] a = new int[2][3];    //{0,0,0
a[0][0] = 10;
a[0][1] = 11;
a[1][0] = 12;

System.out.println(a[0][1]);
System.out.println(a[1][0]);
System.out.println(a.length);

System.out.println(a[0].length);





int [][]c= {{1,2,3,4},{5,6,7,8},{10,11,12,13}};


for (int i = 0; i < c.length; i++) 
{
	for (int j = 0; j < c[i].length; j++)
	{
		System.out.print(c[i][j]+" ");
		
	}
	System.out.println();
	
}		
	}

}
