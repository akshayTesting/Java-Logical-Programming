package BitwiseOperator;

public class AND_Operator {

	public static void main(String[] args) 
	{
/*
 * 
 * if Both value are same it will gives 1 
 * i.e a=1 b=1 result is = 1
 * i.e a=1 b=0 Result is = 0
 *  
 *  result=1 multiplecation
 * 
 */
		int a=10;
		int b=20;
		int c=10;
		System.out.println("A AND b  "+(a&b));
		System.out.println("A ANd C "+(a&c));
		System.out.println("B AND C "+(c&b));
	}

}
