package Array1D;

public class SepratePositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = { 1, -2, 3, 4, 5, -6, 7, 8, 9 };

		int positive[] = new int[a.length];
		int negative[] = new int[a.length];

		for (int i = 0; i <= a.length - 1; i++)

		{
			if (a[i] > 0) {
				positive[i] = a[i];

			}
			else {
				negative[i] = a[i];
			}

		}
		System.out.println("Poisitve values");
		for (int i = 0; i <= positive.length - 1; i++)

		{
			if (positive[i] > 0)
				System.out.println(positive[i]);

		}
		
		System.out.println("negative values");
		for (int i = 0; i <= negative.length - 1; i++)

		{
			if (negative[i] <0)
				System.out.println(negative[i]);

		}
	}

}
