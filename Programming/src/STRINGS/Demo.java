package STRINGS;

public class Demo {

	public static void main(String[] args) {
		
				//012345678910
		String s1="Maharashtra";
		String s2="maharashtra";
		System.out.println("Length of String is  =  "+s1.length());
		System.out.println("s1 is equal to s2 "+s1.equals(s2));
		System.out.println("s1 is equal to s2 "+s1.equalsIgnoreCase(s2));
		System.out.println("============================================");

		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("============================================");

		System.out.println(s2.substring(0,5));
		System.out.println(s2.startsWith("maha"));
		System.out.println("============================================");

		System.out.println(s2.endsWith("tra"));
		System.out.println(s2.isEmpty());
	System.out.println("============================================");
		String s3="Pune";
		String s4="   I Love You India     ";
		System.out.println("Split Method ");
		String [] s5=s4.split(" ");
		for (int i = 0; i < s5.length; i++)
		{
		
			System.out.println(s5[i]);
		}
		System.out.println("====================================");
		System.out.println("Trim Method");
		System.out.println(s4.trim());
		System.out.println("============================================");
		System.out.println("char Array");
		char []ch= {'W','I','N','D','O','W','S'};
		String s = new String(ch);
		String s0 = String.valueOf(ch);
		
	}
}
