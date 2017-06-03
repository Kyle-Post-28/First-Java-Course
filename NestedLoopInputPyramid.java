/*
* File: NestedLoopInputPyramid.java
* Author: Kyle Post
* Date: September 11, 2016
* Purpose: This program is to demonstrate
* the use of a Nested Loop by allowing the user
* to input any number to create a pyramid output
*/
// Import each required Java class
import java.util.Scanner;

/**
 * Nested Loop Input Pyramid Code
 */
public class NestedLoopInputPyramid 
{	
    public static void main(String[] args) 
	{ 
		// Variables to hold values
		int rows = 1;
		byte total = 0;
		
		// Use the Scanner class to input data from Standard I/O
        Scanner scannerIn = new Scanner(System.in);
		
		// Prompt the user to enter the number of rows
	System.out.println("How many rows of * would you like:");	
        total = scannerIn.nextByte();
		
		//This while loop will create rows until the number the user input
		while(rows < total)
		{
		//This nested for loop will add another * for every additional row
			for(int i =1; i < rows; i++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			rows++;
		}
	System.out.println("Nice Pyramid!");
	}
}
