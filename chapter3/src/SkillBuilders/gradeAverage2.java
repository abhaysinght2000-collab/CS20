package SkillBuilders;

import java.util.Scanner;

public class gradeAverage2 
{

	public static void main(String[] args)
	{
		
		double average = 0;
		int total = 0 ;
		
		
		try (Scanner input = new Scanner(System.in)) {
		
			System.out.print("Please enter the first mark: ");
			total += input.nextInt();
			
		
			System.out.print("Please enter the second mark: ");
			total += input.nextInt();
			
			System.out.print("Please enter the third mark: ");
			total += input.nextInt();
		
			System.out.print("Please enter the fourth mark: ");
			total += input.nextInt();
		
			System.out.print("Please enter the fifth mark: ");
			total  += input.nextInt();
		}
		
		
		
		average = (total)/5.0;
		
	
		System.out.println("Grade Average is:" +average+"%");
				
				
		
	}

}
