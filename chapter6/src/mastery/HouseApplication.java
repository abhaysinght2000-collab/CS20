//Program HouseApplication.java
//November 10, 2026
//Program utilses methods to make an image of a house




package mastery;

public class HouseApplication {

	public static void main(String[] args) {
        // Declaration of the methods
		addRoof();
        addBase();
        addWalk();
    }
	// Method for the roof
	
    public static void addRoof() {
    	System.out.println("   /\\  ");
    	System.out.println("  /  \\ "); 
    	System.out.println(" /    \\ "); 
    	System.out.println("/______\\"); 
    	
    }
    // method for the base
	
    public static void addBase() {
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
        System.out.println("   **   ");
    }
    // method for the walkways
    public static void addWalk() {
        System.out.println("   ***********   ");
        
    }
}
