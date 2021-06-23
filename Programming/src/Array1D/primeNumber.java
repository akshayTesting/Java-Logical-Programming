package Array1D;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, -2, 3, 4, 5, -7, 7, 8, 9 };

		for (int i = 0; i <= a.length - 1; i++)
		{

			int num = a[i];

			int j = 2;

			while (0!= num)
			{
				if (num % j == 0)
				{

					break;
				}
				j++;
			}
			
			if (j == num)
			{
				System.out.println(" number  "+j+" is prime ");

			}

		}

		
	}

}
