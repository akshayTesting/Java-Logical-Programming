package Array1D;

public class MargeArray {

	public static void main(String[] args)
	{

		int a[]= {1,2,3,4,5,6};
		int b[]= {7,8,9,10,11};
		
		int sum[]=new int [a.length+b.length];
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum[i]=a[i];
			
			count++;
		}
		
		for(int i=0;i<b.length;i++)
		{
			sum[count++]=b[i];
		
		}
		
		System.out.println("concatination of array");
		for(int i=0;i<sum.length;i++)
		{
		System.out.println(sum[i]);
		
		}
		
	}

}
