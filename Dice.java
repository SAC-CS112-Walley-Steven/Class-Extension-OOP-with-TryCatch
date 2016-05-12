import java.util.Scanner;

public class Dice {

	private int count = 0;
	
	public int Throw()
	{
		count++;
		if (count <= 3)
		{
			int randNum = 1 + (int)(Math.random()*6);
			return randNum;
		}
		else
			throw new IllegalArgumentException();	
	}

	public int getDiceCount() 
	{ 
		return count; 
	}

	public static void main (String[] args)
	{

		Scanner input = new Scanner (System.in);

		Dice dice = new Dice();

		int decision = 0;

		do
		{
			System.out.print("Press 1 to role dice: ");
			decision = input.nextInt();
			
			try
			{
				int diceNum = dice.Throw();
				System.out.println("Dice Number is "+diceNum);

				System.out.println("Dice count is "+dice.getDiceCount());

			
			}
			catch (IllegalArgumentException illegalArgumentException)
			{
				System.out.println("Dice can only role 3 times");
			}
		}
		while (decision ==1);	
	}
}