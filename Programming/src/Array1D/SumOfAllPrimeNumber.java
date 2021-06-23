package Array1D;

public class SumOfAllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a[]= {1,2,3,4,5,6,7,8,9};
		
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		int temp=a[i];
		
		int j=2;
		
		while(j<a[i])
		{
			if(a[i]%j==0)
			{
				break;
			}
			
			j++;
		}
		
		if(j==temp)
		{
			System.out.println(j);
			
			sum=sum+temp;
		}
	}
		System.out.println("sum of prime numbet" + " "+sum);
		
	}

}
