/*
* File: Student.java
* Author: Kyle Post
* Date: September 18, 2016
* Purpose: This creates the class used in the testScores program
*/
public class Student {
	String firstName;
	String lastName;
	int studentId;
	int birthYear;
	
	
	Student(String x1, String x2, int x3, int x4){
		this.firstName = x1;
		this.lastName = x2;
		this.studentId = x3;
		this.birthYear = x4;
	}
	
	public int estimateAge(){
		return(2016 - this.birthYear); 
	}
	
	public String combineName(){
		return (this.firstName + " " + this.lastName);
	}
	
	public int submitId(){
		return this.studentId;
	}
}
