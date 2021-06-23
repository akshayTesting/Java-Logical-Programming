
public class largeNum {

	
	public static void main(String[] args) {
		
		
		int num[]={1,2,3,5,100,7,10,5,6,};
		int max=num[0];
		
		for (int i = 0; i < num.length; i++)
		{
		
			if (num[i]>max)
			{
			
				max=num[i];
			}
		}
		System.out.println("Largest value is "+max);
	}
}
