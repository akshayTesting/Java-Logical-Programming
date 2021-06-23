package Array1D;

public class EvenindexArray {
public static void main(String[] args)
{
	int a[] = { 1, 2, 5, 4, 7, 8, 5, 2, 1, 4 };

	System.out.println("length of a[]" + " " + a.length);
	for (int i = 0; i <= a.length - 1; i++) {

		if (i % 2 == 0) {

			System.out.println("even index" + " " + a[i]);
		}

	}	
}
}
