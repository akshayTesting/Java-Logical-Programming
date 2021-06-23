package UnaryOprators;

public class postIncrement
{

	public static void main(String[] args)
	{

		   // initialize i
        int i = 10;
        System.out.println("Post-Increment");
  
        // i values is incremented to 1 after returning
        // current value i.e; 0
        System.out.println(i++);
  
        // initialized to 0
        int j = 10;
        System.out.println("Pre-Increment");
  
        // j is incremented to 1 and then it's value is
        // returned
        System.out.println(++j);
	}

}
