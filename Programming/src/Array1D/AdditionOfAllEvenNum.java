package Array1D;

public class AdditionOfAllEvenNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		int sum=0;
		int []a= {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < a.length; i++) 
		{
		
			if (a[i]%2==0)
			{
			
				sum=sum+a[i];
			}
			
		}
		System.out.println("Sum Of All Even Number Is "+sum);
	}

}
