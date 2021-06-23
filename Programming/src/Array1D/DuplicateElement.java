package Array1D;

public class DuplicateElement
{
	
	/*
	 * 
	 * In this program, we need to print the duplicate elements 
	 * present in the array. This can be done through two loops. 
	 * The first loop will select an element and the second loop will 
	 * iteration through the array by comparing the selected element
	 *  with other elements. If a match is found,
	 *  print the duplicate element
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int a[]=new int [] {1,2,3,4,6,7,1,2,3};
		
		for (int i = 0; i < a.length; i++)
		{
		
			for (int j = i+1; j < a.length; j++)
			{
			
				if (a[i]==a[j])
				{
				System.out.println("Duplicate elements in given array:"+a[j]);
					
				}
			}
		}
		
		
	}
}
