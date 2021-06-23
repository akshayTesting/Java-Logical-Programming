package Array1D;

public class CommenArray 
{

	public static void main(String[] args) {
		
		String car[]= {"BMW", "mahindra","tata","creata"};
		String showrom[]= {"BMW", "mahindra","tata","creata","i20","furtunar"};
		System.out.println("Comman car in showrom");
		for (int i = 0; i < showrom.length; i++)
		{
		
			for (int j = 0; j < car.length; j++) 
			{
			
				if (car[j]==showrom[i])
				{
				
					System.out.println(car[i]);
					break;
				}
			}
		}
		
	}
}
