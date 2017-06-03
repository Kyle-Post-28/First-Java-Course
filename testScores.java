/*
* File: testScores.java
* Author: Kyle Post
* Date: September 18, 2016
* Purpose: This program asked some questions to find your SAT scores
*which are generated at random
*/
import java.util.Scanner;
public class testScores {

	public static void main(String[] args) {
		
		int scoreMath = (int )(Math.random() * 800 + 200);
		int scoreRw = (int )(Math.random() * 800 + 200);
		
		Scanner reader = new Scanner(System.in);
		int studentId;
		int birthYear;
		String firstName;
		String lastName;
		
		System.out.println(" ");
		System.out.println("==========================================");
		
		System.out.println("Enter the following information to receive your scores.");
		
		System.out.println("Enter your First name: ");
		firstName = reader.next();
		System.out.println("Enter your Last Name: ");
		lastName = reader.next();
		System.out.println("Enter your 6 digit Student ID number: ");
		studentId = reader.nextInt();
		System.out.println("Enter your birth year: ");
		birthYear = reader.nextInt();
		
		System.out.println("==========================================");
		
		Student Random = new Student(firstName, lastName, studentId, birthYear);
		
		System.out.println("Your scored the following");
		System.out.println("Name: " + Random.combineName());
		System.out.println("Age: " + Random.estimateAge());
		System.out.println("Student ID: " + Random.submitId());
		System.out.println("In MATH you scored: " + scoreMath);
		System.out.println("In CRITICAL READING & WRITING you scored: " + scoreRw);
		System.out.println("You total score is: " + (scoreMath +scoreRw) + "/1600");
		reader.close();
		System.exit(0);
	}
}
