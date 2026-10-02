package SkillBuilders;

import java.lang.Math;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximum, minimum, randomNumber;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number: ");
		minimum = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please input a number greater than the previous number: ");
		maximum = input1.nextInt();
		
		randomNumber = (int) (((maximum) - (minimum) +1)*Math.random()+(minimum));
		
		System.out.println("A number between "+ minimum +" and "+maximum+ " is "+ randomNumber);
		
		
			
		}
		

	}
	


