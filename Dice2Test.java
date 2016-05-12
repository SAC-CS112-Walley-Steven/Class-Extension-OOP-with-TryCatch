import java.util.Scanner;

public class Dice2Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		TrippleDice Dice = new TrippleDice();
		
		System.out.print(Dice.Throw());
		
	}

}