package skillbuilders;
import java.util.Scanner;
public class NumbersSum {

	public static void main(String[] args) {
		
		 // Scanner setup
        Scanner userinput = new Scanner(System.in);
        
        // Prompt user for the number
        System.out.print("Enter a number: ");
        int userNumber = userinput.nextInt();
        
        // Declare the sum
        int sum = 0;
        
        for (int i = 1; i <= userNumber; i++) {
            System.out.println(i);
            sum += i;              
        }
        
        // Diplay the sum
        System.out.println("The sum is: " + sum);
        

	}

}
