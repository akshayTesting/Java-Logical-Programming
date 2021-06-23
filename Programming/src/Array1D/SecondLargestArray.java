package Array1D;

public class SecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,9,5,6,9,7,8};
		
		int largest = 0;
		int sLargest = 0;
		for(int i = 0; i < a.length; i++) 
		{
			
			if(a[i] > largest)    //  1>0
			{
				sLargest = largest;    //SL=0,1,2,3,4
				largest = a[i]; //     //lRG=1,2,3,4,9
			}
			       //9>4                9<4
			if((  a[i] > sLargest &&  a[i] < largest))// 
			{
			
				
				sLargest = a[i]; //   sL = 4;
			}
			
		}
		System.out.println("Second Largest "+sLargest);
		System.out.println("Largest one "+largest);
	}

}
