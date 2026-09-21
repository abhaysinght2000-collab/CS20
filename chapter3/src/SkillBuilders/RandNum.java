
package SkillBuilders;

import java.util.Scanner;

public class RandNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min, max; 
		
		try (//Introduce the Scanner class
		Scanner input = new Scanner(System.in)) {
			//Prompt user for the min number
			System.out.println("Enter the min number : ");
			min = input.nextInt();
			
			System.out.println("Enter the max number : ");
			max = input.nextInt();
		}
		
		
		
		//Generate the random numbers
		
		System.out.println("Random number:  "
				+ (int)((max-min+1)*Math.random() 
						+ min));

	}

}

/*Screen Dump
 * Enter the min number : 
1
Enter the max number : 
100
Random number:  69
 */

