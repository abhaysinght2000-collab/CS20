package mastery;

import java.util.Scanner;

public class sleepApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay, daysAlive, lifetimeSleep;
		
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("Please enter you birth date:\nYear: ");
			birthYear = input.nextInt();
			
			System.out.print("Month: ");
			birthMonth = input.nextInt();
			
			System.out.print("Day: ");
			birthDay = input.nextInt();
		
			System.out.print("Please enter the current date:\nYear: ");
			currentYear = input.nextInt();
		
			System.out.print("Month: ");
			currentMonth = input.nextInt();
			
			System.out.print("Day: ");
			currentDay = input.nextInt();
		}
		
		
		daysAlive = (((currentYear)*365)+((currentMonth)*30)+(currentDay)) -  (((birthYear)*365)+((birthMonth)*30)+(birthDay));
		System.out.println("You have been alive for "+daysAlive+" days");
		
		lifetimeSleep= (daysAlive)*8;
		System.out.println("Over your life, you have slept for "+lifetimeSleep+" hours");

	}

}

/* Screen Dump
 * Please enter you birth date:
Year: 2010
Month: 5
Day: 12
Please enter the current date:
Year: 2026
Month: 9
Day: 22
You have been alive for 5970 days
Over your life, you have slept for 47760 hours*
 */

