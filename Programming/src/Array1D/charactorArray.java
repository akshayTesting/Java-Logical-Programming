package Array1D;

public class charactorArray {

	public static void main(String[] args) 
	{
		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'a':
				System.out.println("vowel = " + ch[i]);

				break;
			case 'e':
				System.out.println("vowel =" + ch[i]);

				break;
			case 'i':
				System.out.println("vowel = " + ch[i]);

				break;
			case 'o':
				System.out.println("vowel = " + ch[i]);

				break;
			case 'u':
				System.out.println("vowel = " + ch[i]);

				break;

			default:
				System.out.println("consonant = " + ch[i]);
				break;
			}

		}

	}

}
