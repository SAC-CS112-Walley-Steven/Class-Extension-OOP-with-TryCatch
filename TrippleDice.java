
public class TrippleDice extends Dice2 {
	
	@Override
	public int Throw()
	{
		int randNum = (Throw() + Throw() + Throw()/3);
		return randNum;
	}

}
