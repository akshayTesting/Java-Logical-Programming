package Array1D;

public class ProductOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int product = 1;

		int a[] = { 1, 2, 3, 4 ,5};

		for (int i = 0; i < a.length; i++) {

			if (a[i]%2== 0) {
				product = product * a[i];
			}
		}
		System.out.println("product of even value "+product);
	}

}
