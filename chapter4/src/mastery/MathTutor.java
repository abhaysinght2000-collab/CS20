package mastery;

import java.util.Scanner;

public class MathTutor {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double answer, userAnswer;
		
		int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        
        int operator = (int)(Math.random() * 4);
        answer =0;
        Scanner input = new Scanner(System.in);
        
        switch (operator) {
       
        
        case 0:answer= (double)num1+num2;
        System.out.println("What is "+num1+" + "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct");
        }
        	else {System.out.println("Wrong the answer is: "+answer);
        	
        }
        break;
        
        
        case 1: answer= (double)num1*num2;
        System.out.println("What is "+num1+" * "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct");}
        else {System.out.println("Wrong the answer is: "+answer);}
        break;

       
        
        case 2: 
        answer =  (double)num1/num2;
        System.out.println("What is "+(num1)+" / "+ num2+": ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer) {
        	System.out.println("Correct");
        	
        	
        }else {System.out.println("Wrong the answer is: "+answer);}
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
