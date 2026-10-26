package mastery;
import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int userGuess;
		 int actualNumber = (int)(Math.random() * 20)+1;
		

		System.out.print("Guess the number 1-20: Enter a positive integer: ");
		userGuess = input.nextInt();
		
		while ((userGuess>=1) && (userGuess<=20)) {
			if (userGuess == actualNumber) {
				System.out.print("You WON!"  );
				break;
				
			}
			
			
			System.out.print("WRONG, Try again:  "  );
			userGuess = input.nextInt();
		}
	}

}
