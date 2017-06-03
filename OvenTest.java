/* 
 * Filename: OvenTest.java
 * Author: Kyle Post
 * Date: October 1, 2016
 * Purpose: Program uses the constructs
*  instances of the class
*  Oven and it's methods
 */
 
public class OvenTest { 

public static void main(String[] args){
	//Create Oven object using the default contructor
	Oven oven1 = new Oven();
	
	//Create additional Oven objects with different parameters
	Oven oven2 = new Oven(true, 350, 7);
	Oven oven3 = new Oven(true, 425, 12);
	Oven oven4 = new Oven(true, 550, 19);
	Oven oven5 = new Oven(true, 200, 3);
	
	//Print with String Format Method
	System.out.println(oven1.toString());
	System.out.println(oven2.toString());
	System.out.println(oven3.toString());
	System.out.println(oven4.toString());
	System.out.println(oven5.toString());
		
	}
}
