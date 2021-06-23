package Array1D;

public class secondLargestNumberArray {
public static void main(String[] args)
{

	int a[]= {1,2,3,4,5,6,7,8,9,10,11};
	int maxnumber=0;
	int secondmaxnumber=0;
	
	for (int i = 0; i < a.length; i++)
	{
	
		if(a[i]> maxnumber)
		{
			secondmaxnumber=maxnumber;
			maxnumber=a[i];
			
		}
		if(a[i]>secondmaxnumber && a[i]<maxnumber)
		{
			secondmaxnumber=a[i];
		}
	}
	System.out.println("Largest Number is "+maxnumber);
	System.out.println("SecondLargest Number is "+secondmaxnumber);
	
}
}
