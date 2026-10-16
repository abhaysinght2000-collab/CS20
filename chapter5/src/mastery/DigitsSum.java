package mastery;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int userNumber;
		 int sum=0;
		
		System.out.print("Enter a positive integer: ");
		userNumber = input.nextInt();
		
		while (userNumber>0) {
			int lastDigit= userNumber %10;
			sum += lastDigit;
			userNumber = userNumber/10;
		}

		System.out.print("Sum of Digits  is : "+(sum));
	}

}
