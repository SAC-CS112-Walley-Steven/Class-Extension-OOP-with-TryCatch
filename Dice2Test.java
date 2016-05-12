import java.util.Scanner;

public class Dice2Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		TrippleDice Dice = new TrippleDice();
		Dice2 dice1 = new Dice2();
		
		System.out.println(Dice.Throw());
		System.out.print(dice1.Throw());
		
	}

}