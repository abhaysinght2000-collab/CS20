//Program DeliveryService.java
//October 4, 2026
//The program will prompt user for weight and dimensions of a package, and provides feedback if their package (does/does not) violates the weight (and/or) dimension thresholds. 


package mastery;

import java.util.Scanner;

public class DeliveryService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variables
		double weight, length, width, height;
		
		
		//Prompt User for Weight
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in kilograms: ");
		weight = input.nextDouble();
		
		//Prompt user for package dimensions
		System.out.print("Enter package length in centimeters: ");
		length = input.nextDouble();
		
		System.out.print("Enter package width in centimeters: ");
		width = input.nextDouble();
		
		System.out.print("Enter package height in centimeters: ");
		height = input.nextDouble();
		
		
		//Program figures if Users package exceeds either or both weight and volume thresholds
		if ((weight<=27 && (length*width*height)>100000)) {
			System.out.print("Package is Too large: ");
			
		}
		if (weight>27 && (length*width*height)<=100000) {
			System.out.print("Package is Too heavy: ");
		}
		if (weight>27 && (length*width*height)>100000) {
			System.out.print("Package is Too heavy and Too big ");
		}
		if (weight<=27 && (length*width*height)<=100000) {
			System.out.print("Accepted ");
		}

	}

}

/*ScreenDump
 * 
Enter weight in kilograms: 35
Enter package length in centimeters: 200
Enter package width in centimeters: 100
Enter package height in centimeters: 100
Package is Too heavy and Too big 
*/
