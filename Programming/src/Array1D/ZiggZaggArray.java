package Array1D;

public class ZiggZaggArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5};                  // length =5
		int b[]= {6,7,8,9,10,11,12,13};       //length=8
		
		int zigzag[]= new int[a.length+b.length];    //     13
		
		int length= b.length>a.length?a.length:b.length; //  length= 8>5 ?5:8 =5
		
		int k=0;
		
		for (int i = 0; i <length; i++)
		{
				zigzag[k]=a[i];           // z[k]=0,6,2,7,3.....10
				k++;
				zigzag[k]=b[i];
				k++;
			
		}
		
		if(a.length>b.length)
		{
			for (int i = length; i < a.length; i++) {
			
			zigzag[k]=a[i];
			k++;
			}
		}
		else if(b.length>a.length)
		{
			for (int i = length; i < b.length; i++) {
			
			zigzag[k]=b[i];
			k++;
			}
		}
		
		
		for (int i = 0; i < zigzag.length; i++) {
			
			System.out.println(zigzag[i]);
			
		}
	}

}
