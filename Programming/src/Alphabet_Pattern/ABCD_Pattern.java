	package Alphabet_Pattern;
								
public class ABCD_Pattern 
{
public static void main(String[] args) {
	
	
	
	int line=5;
	int charCount=5;
	char ch='A';
	
	for (int i = 1; i <=line; i++)
	{
	
		for (int j = 0; j <=charCount; j++)
		{
		
			System.out.print(ch);
		
		}
		System.out.println();
		ch++;
	}
}
}
