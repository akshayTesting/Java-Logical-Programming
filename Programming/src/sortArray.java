import java.util.Arrays;

public class sortArray
{

	public static void main(String[] args) {
		
		
		int []arr=  {10,12,9,8,7,4,5,6,1,2,3,0};
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) 
		{
		
			System.out.println(arr[i]);
		} 
	}
}
