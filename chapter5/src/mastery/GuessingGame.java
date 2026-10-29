//Program GuessingGame.java
//October 20, 2026
//A game where a user has to guess a number between 1 and 20


package mastery;
import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Delcaring Scanner
		Scanner input = new Scanner(System.in);

		//Generating a random number between 1 and 20
		int userGuess;
		 int actualNumber = (int)(Math.random() * 20)+1;
		
		//Prompting user to enter a guess
		System.out.print("Guess the number 1-20: Enter a positive integer: ");
		userGuess = input.nextInt();

		//While User answer remains in the range between 1 and 20, the game will continue, it will end once the player wins
		while ((userGuess>=1) && (userGuess<=20)) {
			if (userGuess == actualNumber) {
				System.out.print("You WON!"  );
				break;
				
			}
			
			//User will be told that they are wrong, and be given another chance
			System.out.print("WRONG, Try again:  "  );
			userGuess = input.nextInt();
		}
	}

}
