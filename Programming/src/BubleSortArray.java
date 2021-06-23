
public class BubleSortArray {

	
	public static void main(String[] args) {
		
		int a[]={1,5,3,4,6,8,7,9,2,10};
		
		for (int i = 0; i < a.length; i++)
		{
		
			for (int j = i+1; j < a.length; j++) // j=i+1; comapre with index 0with next value
			{
			
				if(a[i]>a[j])
				{
					int temp=a[i];
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
