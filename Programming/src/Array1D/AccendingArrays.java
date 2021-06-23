package Array1D;

public class AccendingArrays {

	public static void main(String[] args) 
	{
		int a[]= {1,3,2,4,5,8,6,2};
		int temp=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]>a[j])
	
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			for (int i = 0; i < a.length; i++) 
			{
			
			System.out.println(a[i]);
		
			}
		
		
		
	}

}
