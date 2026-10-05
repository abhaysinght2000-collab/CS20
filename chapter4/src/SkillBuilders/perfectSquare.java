package SkillBuilders;

import java.util.Scanner;

import java.lang.Math;


public class perfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		int root;
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an integer: ");
		userInput = input.nextInt();
		
		root = (int) Math.sqrt(userInput);
		
		if (root*root==userInput) {
			System.out.println("It is a perfect square");
		}else {
			System.out.println("Not a perfect square");
				
			}
			
		if (userInput<=0) {
			System.out.println("Not a perfect square ");
			
		}
		}

	}
	
	


