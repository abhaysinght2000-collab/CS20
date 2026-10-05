package mastery;

import java.util.Scanner;

public class DeliveryService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight, length, width, height;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in kilograms: ");
		weight = input.nextInt();
		
		System.out.print("Enter package length in centimeters: ");
		length = input.nextInt();
		
		System.out.print("Enter package width in centimeters: ");
		width = input.nextInt();
		
		System.out.print("Enter package height in centimeters: ");
		height = input.nextInt();
		
		if (weight>27) {
			System.out.print("Package is Too heavy: ");
		}
		
		if ((length*width*height)>100000) {
			System.out.print("Package is Too large: ");
			
		}
		if (weight>27) {
			System.out.print("Package is Too heavy: ");
		}
		if (weight>27 && (length*width*height)>27) {
			System.out.print("Package is Too heav and Too big: ");
		}

	}

}
