//Program eiesteinFormula.java
//September 29, 2026
//The program will calculate the amount of energy within a object based on the objects mass entered by the user. With this it can calculate how many 100 watt lightbulbs can be powered by it. 
package mastery;

import java.util.Scanner;

public class einsteinFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring variables
		double mass;
		double energy;
		double lightBulb;
		
				
		//Prompting user for mass of the object in kilograms
		try (Scanner input=new Scanner (System.in)) {
			System.out.print("Please enter the mass (kilograms): ");
			mass = input.nextDouble();
			}

		//Calculating the energy based off the mass of the object
		energy = (mass)*299792458.0*299792458;

		//Using the energy calculated previously to find how many 100 watt light bulbs could be powered
		lightBulb = (energy)/360000;

		//Program displays the amount of energy produced by the object nd the amount of 100 watt light bulbs which could be powered by it
		System.out.println("The energy produced is " + energy + "Joules");
		System.out.println("The number of 100 watt light bulbs powered " + lightBulb);
		
		

	}

}

/* Screen Dump 
 * Please enter the mass (kilograms): 5
The energy produced is4.493775893684088E17Joules
The number of 100 watt light bulbs powered1.2482710815789133E12*
 */
