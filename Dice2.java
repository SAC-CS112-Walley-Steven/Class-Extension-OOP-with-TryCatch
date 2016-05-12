public class Dice2 {
	
	public static int Throw()
	{
		int randNum = 1 + (int)(Math.random()*6);
		return randNum;
	}
	
	public static int Throw(int dices)
	{
		int diceNum = dices * (1 + (int)(Math.random()*6));
		return diceNum;
	}
	
	public static int Throw (int dices, int bounces)
	{
		int diceNum = ((dices * (1+(int)(Math.random()*6))) * bounces)/bounces;
		return diceNum;
	}

}


