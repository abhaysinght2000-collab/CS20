package mastery;
import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int userGuess;
		 int actualNumber = (int)(Math.random() * 20);
		

		System.out.print("Enter a positive integer: ");
		userGuess = input.nextInt();
		
		while (userGuess>=1)&& (userGuess<=20) {
			System.out.print("WRONG, Try again:  "  );
			if (userGuess == actualNumber) {
				System.out.print("You WON!"  );
				break;
				
			}
		}
	}

}
