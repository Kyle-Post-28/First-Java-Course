/*
*  Filename: CrimeDataTest.java
*  Author: Kyle Post
*  Data: October 16, 2016
*  Purpose: Program creates a menu
*  for use to input specific function 
*  and then use get method to retrieve
* data from Crimes ArrayList
*/
import java.util.Scanner;

public class CrimeDataTest  {

public static void main(String[] args) {
char quit = 'n';
String input;
char choice;
Crimes CD1 = new Crimes();
Scanner scan = new Scanner(System.in);
System.out.println("************** Welcome to the US Crime Statistical Application***************");

while (quit !='y') {
	System.out.println("Please enter the number of the question you would like answered. Enter 'Q' to quit the prgram: "
				+ "\n"
				+ "\n1. What were the percentages in the population growth for each consecutive year from 1994-2013?"
				+ "\n2. What year was the Murder rate the highest?"
				+ "\n3. What year was the Murder rate the lowest?"
				+ "\n4. What year was the Robbery rate the highest?"
				+ "\n5. What year was the Robbery rate the lowest?"
				+ "\n6. What was total percentage change in Motor Vehicle Thefts between 1998 and 2012?"
				+ "\n7. What was the difference of Burglary rates between 1994 and 2013?"
				+ "\n8. What was the total amount of Violent Crimes between 2010 and 2013?"
				+ "\nQ. Quit the Program");
	choice = scan.next().charAt(0);
	
	switch (choice) {
		case '1':
			System.out.println("\nThe percentages in the population growth for each consecutive year from 1994-2013 are: " + "\n");
			for (int i = 1; i < 20; i++){
			System.out.format("%d-%d: %f\n", i + 1993, i + 1994, CD1.getPopulationGrowth(i));
			}
			System.out.println("\n");
			break;
		case '2':
			System.out.println("\nThe Murder rate was the highest in the year: " + CD1.getMurderRateHigh(1) + "\n");
			break;
		case '3':
			System.out.println("\nThe Murder rate was the lowest in the year: " + CD1.getMurderRateLow(20) + "\n");
			break;
		case '4':
			System.out.println("\nThe Robbery rate was the highest in the year: " + CD1.getRobberyRateHigh(1) + "\n");
			break;
		case '5':
			System.out.println("\nThe Robbery rate was the lowest in the year: " + CD1.getRobberyRateLow(20) + "\n");
			break;
		case '6':
			System.out.println("\nThe total percentage change in the Motor Vehicle Thefts between 1998 and 2012 is: " + CD1.getMotorVehicleThefts() + "\n");
			break;
		case '7':
			System.out.println("\nThe difference of Burglary rates between 1994 and 2013 is: " + CD1.getBurglaryRateDifference() + "\n");
			break;
		case '8':
			System.out.println("\nThe total amount of Violent Crimes between 2010 and 2013 is: " + CD1.getViolentCrimes() + "\n");
			break;
		case 'Q':
			System.out.println("\nThank you for trying the US Crimes Statistics Program." + "\n");
			quit = 'y';
			break;
		default:
			System.out.println("That wasn't a choice. Please enter a different number" + "\n");
	}	
   }
   return;
 }
}