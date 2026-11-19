package mastery;
import java.util.Scanner;


public class IsoTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drawBar();
		addSpaces();
		int height;
		Scanner input = new Scanner(System.in);

		
		System.out.print("Please enter the height: ");
		height = input.nextInt();

		
		

	}

	
	public static void drawBar() {
    	System.out.println("   /\\  ");
    	System.out.println("  /  \\ "); 
    	System.out.println(" /    \\ "); 
    	System.out.println("/______\\"); 
   
    	
    }
	
	
	public static void addSpaces() {
    	System.out.println("   /\\  ");
    	System.out.println("  /  \\ "); 
    	System.out.println(" /    \\ "); 
    	System.out.println("/______\\");
	}
}
