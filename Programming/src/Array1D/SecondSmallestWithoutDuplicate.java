package Array1D;

public class SecondSmallestWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = { 1, 3, 2, 4, 5, 8, 6 ,7};

		int temp = 0;

		for (int i = 0; i < a.length; i++) //i= 1,2
		{
			for (int j = i + 1; j < a.length; j++) //j=3,2
			{

				if (a[i] > a[j])   //3>2
				{
					temp = a[i];   //  te=3
					a[i] = a[j];   //  i=2
					a[j] = temp;   //  j=3
					
				}

			}
		}
		
			System.out.println(a[a.length-(a.length-2)]);
	}

}
