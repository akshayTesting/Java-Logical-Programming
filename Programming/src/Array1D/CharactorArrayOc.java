package Array1D;

public class CharactorArrayOc {

	public static void main(String[] args)
	{

		char ch[]={'a','b','c','d','e','f','g','h','i','j','k'};

		char vowels[]=new char[ch.length];  // {a,' ',' ',0,0,0,0,0,0,0,0 }

		char cons[]=new char[ch.length];   //  {' ','b','c',0,0,0,0,0,0,0,0 }


		for(int i=0;i<ch.length ;i++)


		{
			if(ch[i]=='a' || ch[i] =='e' || ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
			{
					
			vowels[i]=ch[i];

			}

			else
			{
				
				cons[i]=ch[i];
				
			}

		}	

		System.out.println("vowels are ");


		for(int i=0;i<vowels.length;i++)
		{
			//if(vowels[i]>' ')
			if(vowels[i]>'\u0000')
			
		System.out.println(vowels[i]);

		}




		System.out.println("consonants  are ");


		for(int i=0;i<cons.length;i++)
		{
			//if(conso[i]>' ')
			if(cons[i]>'\u0000')
			
		System.out.println(cons[i]);

		}
	}

}
