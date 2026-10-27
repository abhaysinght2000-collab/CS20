//Program DigitsSum.java
//October 20, 2026
//The program will prompt user for a number, then it will add all the numbers together


package mastery;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring Scanner
		Scanner input = new Scanner(System.in);
		//Declaring Variables
		int userNumber;
		 int sum=0;
		//Prompt user for any number
		System.out.print("Enter a positive integer: ");
		userNumber = input.nextInt();
		//Adds each digit of the user entered number together
		while (userNumber>0) {
			int lastDigit= userNumber %10;
			sum += lastDigit;
			userNumber = userNumber/10;
		}
		//Prints the sum of all the digits in the user number
		System.out.print("Sum of Digits  is : "+(sum));
	}

}
