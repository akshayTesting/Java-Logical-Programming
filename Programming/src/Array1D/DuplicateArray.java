package Array1D;

import java.util.Iterator;

public class DuplicateArray {

	public static void main(String[] args)
	{
int a[]= {1,2,1,5,6,3,7,9,3};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate value "+a[i]);
				}
				
			}
			
		}
	}

}
