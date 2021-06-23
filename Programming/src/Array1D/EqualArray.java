package Array1D;

public class EqualArray {

	public static void main(String[] args)
	{
			
		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 ,};
	

		/*
		 * System.out.println("Is array 1 equal to array 2?? " +Arrays.equals(ary,
		 * ary1)); System.out.println("Is array 1 equal to array 3?? "
		 * +Arrays.equals(ary, ary2));
		 * 
		 */
		int count = 0;
		
		if (ary.length == ary1.length) 
		{
			for (int i = 0; i < ary.length; i++)
			{
				if (ary[i] == ary1[i]) 
				{
					count++;
				}

			}

		}

		if (ary.length == count)
		{
			System.out.println("array is equal");
		} else 
		{
			System.out.println("not equal");
		}
	}

}
