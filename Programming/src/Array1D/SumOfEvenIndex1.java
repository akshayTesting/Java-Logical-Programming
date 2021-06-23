package Array1D;

public class SumOfEvenIndex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		int a[] = { 1, 2, 3, 4 };

		for (int i = 0; i < a.length; i++) {

			if (i%2!= 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("sum of odd index "+sum);
	}

}
