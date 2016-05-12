import java.util.Scanner;

public class Dice2Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		ThreeDice trippleDice = new ThreeDice();
			
		System.out.print("Enter the number of dices to play with: ");
		int diceNum = Dice2.Throw(input.nextInt());
		
		System.out.println("Dice number is "+ diceNum);
		
		System.out.println(trippleDice.Throw());
		
		System.out.println(trippleDice);
	}

}