package SkillBuilders;

import java.util.Scanner;

public class rectangle
{

	public static void main(String[] args)
	{
		//Declare Variables
		int length;
		int width;
		
		//Create a Scanner
		Scanner userinput= new Scanner(System.in);
	
		
		//Get the width value from the user
		width = userinput.nextInt();
		
		//Get the length value from the user
		length = userinput.nextInt();
		//Ask the user to enter the width
		System.out.print("Please enter the width: ");
		//Ask the user to enter the length
		System.out.print("Please enter the length: ");
				
		//Display the Width and Length on the console
		System.out.print("The width is: "+ width);
		System.out.print("The length is: "+ length);

		
		/**
		 * Calculates and displays the area of a rectangle
		 */
		 int area; //calculated area of rectangle
		 area = length * width;
		 System.out.println("Area: " + area);
		 }

        

		
		
	}


