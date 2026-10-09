//Program MathTutor.java
//October 3, 2026
//The program will provide user with a math equation using the following operators (+,-,/,*), with the numbers in the equations are randomly selected 1 from 10.

package mastery;

import java.util.Scanner;

public class MathTutor {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring Variables
		double answer, userAnswer;
		
		//Creating 2 random number for the math equation
		int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        
        //Generating a number which corresponds to a operator
        int operator = (int)(Math.random() * 4);
        
        
        answer =0;
        Scanner input = new Scanner(System.in);
        
        
        //Depending on the random number generated for the variables "operator" the program will either add,subtract,divide or multiply
        //The program would then prompt the user for an answer
        //It then checks whether the users answer matches the actual answer
        //If it does, the program would print "Correct), If it does not match, "Wrong, the answer is: answer"
        switch (operator) {
       
        
        case 0:answer= (double)num1+num2;
        System.out.println("What is "+num1+" + "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct");
        }
        	else {System.out.println("Wrong, the answer is: "+answer);}
        break;
        
        
        case 1: answer= (double)num1*num2;
        System.out.println("What is "+num1+" * "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct");}
        
        else {System.out.println("Wrong, the answer is: "+answer);}
        break;

       
        
        case 2: 
        answer =  (double)num1/num2;
        System.out.println("What is "+(num1)+" / "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct"); }
        
        else {System.out.println("Wrong the answer is: "+answer);}
        	break;
        	
        
        
        case 3:
        answer =  (double)num1-num2;
        System.out.println("What is "+num1+" - "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct");}
        	
        	else {System.out.println("Wrong the answer is: "+answer);}
        	break;
        	
        
        
        
        
        
        }
        
        

	}

}

//Screen Dump
/*Enter weight in kilograms: 24
Enter package length in centimeters: 1100
Enter package width in centimeters: 200
Enter package height in centimeters: 304
Package is Too large*/

