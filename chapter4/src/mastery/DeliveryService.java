package mastery;

import java.util.Scanner;

public class DeliveryService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight, length, width, height;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in kilograms: ");
		weight = input.nextDouble();
		
		System.out.print("Enter package length in centimeters: ");
		length = input.nextDouble();
		
		System.out.print("Enter package width in centimeters: ");
		width = input.nextDouble();
		
		System.out.print("Enter package height in centimeters: ");
		height = input.nextDouble();
		
		
		
		if ((weight<=27 && (length*width*height)>100000)) {
			System.out.print("Package is Too large: ");
			
		}
		if (weight>27 && (length*width*height)<=100000) {
			System.out.print("Package is Too heavy: ");
		}
		if (weight>27 && (length*width*height)>100000) {
			System.out.print("Package is Too heavy and Too big ");
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
