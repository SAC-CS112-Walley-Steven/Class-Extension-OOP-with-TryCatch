public class ThreeDice {
	
	private Dice2 D1, D2, D3;
	
	public int Throw()
	{
		int average = (D1.Throw(1) + D2.Throw(1) + D3.Throw(1))/3;
		return average;
	}
	
	
	public String toString()
	{
		return String.format("D1 = %d\nD2 = %d\nD3 = %d", D1, D2, D3);
	}

}