package SkillBuilders;

import java.util.Scanner;

public class digits 
{

	public static void main(String[] args)
	{
		int number, onesPlace, tensPlace, userinput;
	
		
	Scanner userinput1 = new Scanner(System.in);
	
	System.out.print("Enter a 2 digit number: ");
	number = userinput1.nextInt();
	
	onesPlace = number % 10;
	tensPlace = number / 10;
	
	System.out.println("Tens place digit: " + tensPlace);
	System.out.println("Ones place digit: " + onesPlace);
	}

}
