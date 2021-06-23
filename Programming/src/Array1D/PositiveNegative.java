package Array1D;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = { 1, -2, 3, 4, 5, -6, 7, 8, 9,10,-11 };

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] > 0)
			{
				System.out.println("positive" + " " + a[i]);
			} 
			if(a[i]<0) {
				System.out.println("negative" + " " + a[i]);

			}
		}
	}

}
