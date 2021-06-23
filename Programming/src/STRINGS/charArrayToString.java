package STRINGS;

public class charArrayToString {

	
	public static void main(String[] args) {
		
		char ch[]= {'w','i','n','d','o','w','s'};
		/*The java string valueOf() method converts different types of values into string.
		 By the help of string valueOf() method, you can convert int to string, long to string,
		 boolean to string, character to string, 
		 float to string, double to string, object to string and char array to string */
	String s1=new String(ch);
	String s2=String.valueOf(ch);
	System.out.println(s2);
	System.out.println("============================================");

	String s3="I LOVE MY INDIA";
	char ch1[]=s3.toCharArray();
	for (int i = 0; i < ch1.length; i++)
	{
	
		System.out.println(ch1[i]);
	}
	/*
	 The java string toCharArray() method converts the given string into 
 		sequence of characters. The returned array length is
 	 equal to the length of the string
	 */
	}
}
