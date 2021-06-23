package Array1D;

public class CommenArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = { 12, 13, 23, 15, 11, 16 };
		int b[] = { 53, 26, 23, 15, 18, 13 };
		System.out.println("Comman Element in Array is");
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
			
				if (a[i]==b[j])
				{
				System.out.println(a[i]);	
				break;
				}
				//System.out.println();
			}
		}
	}

}
