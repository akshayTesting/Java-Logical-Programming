
public class ReverseString
{

	public static void main(String[] args) 
	{
	
		
		String name="I LOVE INDIA";
		char [] arr=name.toCharArray();
		for (int  i=  arr.length-1; i>0; i--)
		{
		System.out.print(arr[i]);	
		}
	}
}
