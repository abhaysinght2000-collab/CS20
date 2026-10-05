package SkillBuilders;

import java.util.Scanner;

public class deliveryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length, width, height;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input length of package: ");
		length = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please input width of package: ");
		width = input1.nextInt();
		
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please input height of package: ");
		height = input2.nextInt();
		
			
		if (height<=10 && width<=10 && length<=10) {
			System.out.println("Accept");
		}
		
		if (width>10) {
			System.out.println("Reject");
		}
		if (length>10) {
			System.out.println("Reject");
		}
		
		if (height>10) {
			System.out.println("Reject");
		}
	
		}
		
		

	}


