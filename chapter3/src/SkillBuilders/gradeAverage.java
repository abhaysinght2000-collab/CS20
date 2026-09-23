package SkillBuilders;

import java.util.Scanner;

public class gradeAverage 
{

	public static void main(String[] args)
	{
		int firstMark, secondMark, thirdMark, fourthMark, fifthMark;
		double average;
		
		
		try (Scanner input = new Scanner(System.in)) {
		
			System.out.print("Please enter the first mark: ");
			firstMark = input.nextInt();
			
		
			System.out.print("Please enter the second mark: ");
			secondMark = input.nextInt();
			
			System.out.print("Please enter the third mark: ");
			thirdMark = input.nextInt();
		
			System.out.print("Please enter the fourth mark: ");
			fourthMark = input.nextInt();
		
			System.out.print("Please enter the fifth mark: ");
			fifthMark = input.nextInt();
		}
		
			
		
		
		average= (firstMark+secondMark+thirdMark+fourthMark+fifthMark)/5.0;
	
		
		System.out.println("Grade Average is:"+ average);
				
				
		
	}

}
