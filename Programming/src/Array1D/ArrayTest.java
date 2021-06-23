package Array1D;

public class ArrayTest {

	public static void main(String[] args)
	{

		
		int tablet[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("length of tablets" + " " + tablet.length);

		System.out.println("length of tablets index" + " " + (tablet.length - 1));

		int[] tablet2 = new int[9];

		for (int i = 0; i < tablet.length-1; i++) {

			tablet2[i] = tablet[i];

			System.out.println(tablet2[i]);
		}
	}

}
