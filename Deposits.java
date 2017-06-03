/*
* File: Deposits.java
* Author: Kyle Post
* Date: September 25, 2016
* Purpose: This program uses arrays of a  
* Checking and Saving Accounts to find
* the balance of each type of account.
*/
public class Deposits {

	public static void main(String[] args) {
		
		// Declare Variables
		double checkAccnt[] = {1364.37, 56323.69, 5729.12, 1232.79};
		double saveAccnt[] = {15737.02, 27240.19, 7999.99, 11107.05};
		double checkTotal = 0.00;
		double saveTotal = 0.00;
		
		// This uses the checkAccnt array and shows the amounts for various deposits.
		for(int i = (checkAccnt.length - 1); i >= 0; i-- ){
			checkTotal = checkTotal + checkAccnt[i]; 
			System.out.println("The total for deposit " + (i + 1) + " is : $" + checkAccnt[i]);
		}
		checkTotal = checkTotal;
		// Print the balance of the checkings account
		System.out.println("The balance of your checking account is: $" + checkTotal);
		
		// This uses the saveAccnt array and shows the amounts for each of the various deposits.
		for(int i = (saveAccnt.length - 1); i >= 0; i--){
			saveTotal = saveTotal + saveAccnt[i];
			System.out.println("The total for deposit " + (i + 1) + " is : $" + saveAccnt[i]);
		}
		saveTotal = saveTotal;
		//Print the balance of the savings account
		System.out.println("The balance of your savings account is: $" + saveTotal);
	}
}
