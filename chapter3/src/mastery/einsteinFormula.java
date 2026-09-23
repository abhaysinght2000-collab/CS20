package mastery;

import java.util.Scanner;

public class einsteinFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mass;
		double energy;
		double lightBulb;
		
				
		
		try (Scanner input=new Scanner (System.in)) {
			System.out.print("Please enter the mass (kilograms): ");
			mass = input.nextDouble();
			}
		
		energy = (mass)*299792458.0*299792458;
		lightBulb = (energy)/360000;
		
		System.out.println("The energy produced is " + energy + "Joules");
		System.out.println("The number of 100 watt light bulbs powered " + lightBulb);
		
		

	}

}

/* Screen Dump 
 * Please enter the mass (kilograms): 5
The energy produced is4.493775893684088E17Joules
The number of 100 watt light bulbs powered1.2482710815789133E12*
 */