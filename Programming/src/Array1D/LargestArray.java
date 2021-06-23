package Array1D;

public class LargestArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,-9,5,6,3,7,9,3};
		
		int max=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum number in the given array is "+max);
	}

}
