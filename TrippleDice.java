
public class TrippleDice extends Dice2 {
	
	@Override
	public int Throw()
	{
		int randNum = (super.Throw() + super.Throw() + super.Throw())/3;
		return randNum;
	}

}
