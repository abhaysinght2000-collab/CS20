package mastery;

import java.util.Scanner;

public class IsoTriangle {

    public static void main(String[] args) {
        int height;
        Scanner input = new Scanner(System.in);

        // Prompt the user for the height of the triangle
        System.out.print("Please enter the height: ");
        height = input.nextInt();

        // Loop through each row to build the triangle
        for (int row = 1; row <= height; row++) {
            // Calculate leading spaces and characters for the current row
            int spaces = height - row;
            int stars = (2 * row) - 1;

            addSpaces(spaces);
            drawBar(stars);
        }
    }

    /**
     * Prints a specified number of blank spaces on the same line.
     */
    public static void addSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Prints a specified number of characters (a bar) and moves to a new line.
     */
    public static void drawBar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after drawing the bar
    }
}

	
	

