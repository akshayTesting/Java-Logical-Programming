package Array1D;

public class EvenValues {

	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("length of a" + " " + a.length);

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}
	}

}
