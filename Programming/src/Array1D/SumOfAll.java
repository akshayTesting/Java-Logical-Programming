package Array1D;

public class SumOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		int a[] = { 1, 2, 3, 4};

		for (int i = 0; i <a.length; i++) 
		{
			sum = sum + a[i];
		}
		System.out.println("Addition Result is::"+sum);
	}

}
