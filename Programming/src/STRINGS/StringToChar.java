package STRINGS;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="I LOVE INDIA";
	
			char[]ch=s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[i]);
			}
			
	}

}

/*
 * The java string toCharArray() method converts the given string into
 *  a sequence of characters.
 *  The returned array length is equal to the length of the string
 */
