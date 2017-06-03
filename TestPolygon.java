/*
* File: TestPolygon.java
* Author: Kyle Post
* Date: September 18, 2016
* Purpose: This program constructs instances
* of the Polygon class and uses
* its methods
*/

public class TestPolygon {	
    public static void main(String[] args)  { 

	// Construct for Polygon 1
        Polygon p1 = new Polygon(8,13.0,3.0,9.0,6.0);
     
	// Construct a default Polygon: Polygon 2
	Polygon p2 = new Polygon();
	
	// Construct for Polygon 3
        Polygon p3 = new Polygon(10,2.0,0.4,0.2,1.5);
    
	// Construct for Polygon 4
        Polygon p4 = new Polygon(18,26.3,17.0,11.0,21.0);
    
	// Construct for Polygon 5
        Polygon p5 = new Polygon(100,5.0,7.0,3.0,2.2);
	

	// Call the getter methods for Polygon 1
	int p1NumSides = p1.getNumSides();
	double p1SideLength = p1.getSideLength();
	double p1XCoord = p1.getXCoord();
	double p1YCoord = p1.getYCoord();
	double p1Apothem = p1.getApothem();
	// Print results
	System.out.println("Number of Sides for Polygon 1: " + p1NumSides);
	System.out.println("Side Length for Polygon 1: " + p1SideLength);
	System.out.println("X-Coordinate for Polygon 1: " + p1XCoord);
	System.out.println("Y-Coordinate for Polygon 1: " + p1YCoord);
	System.out.println("Apothem for Polygon 1: " + p1Apothem);
		// Call the Perimeter Method
	double p1Perimeter = p1.getPerimeter();
	// Print results
	System.out.println("Perimeter of Polygon 1 is: " + p1Perimeter);
	
	// Call the Area Method
	double p1Area = p1.getArea();
	// Print results
	System.out.println("The Area of Polygon 1 is: " + p1Area);
	System.out.println("-------------------------------------");
	
	//Call the getter method for Polygon 2
	int p2NumSides = p2.getNumSides();
	double p2SideLength = p2.getSideLength();
	double p2XCoord = p2.getXCoord();
	double p2YCoord = p2.getYCoord();
	double p2Apothem = p2.getApothem();
	// Print results
	System.out.println("Number of Sides for Polygon 2: " + p2NumSides);
	System.out.println("Side Length for Polygon 2: " + p2SideLength);
	System.out.println("X-Coordinate for Polygon 2: " + p2XCoord);
	System.out.println("Y-Coordinate for Polygon 2: " + p2YCoord);
	System.out.println("Apothem for Polygon 2: " + p2Apothem);
	// Call the Perimeter Method
	double p2Perimeter = p2.getPerimeter();
	// Print results
	System.out.println("Perimeter of Polygon 2 is: " + p2Perimeter);
	
	// Call the Area Method
	double p2Area = p2.getArea();
	// Print results
	System.out.println("The Area of Polygon 2 is: " + p2Area);
	System.out.println("-------------------------------------");
	
	//Call the getter method for Polygon 3
	int p3NumSides = p3.getNumSides();
	double p3SideLength = p3.getSideLength();
	double p3XCoord = p3.getXCoord();
	double p3YCoord = p3.getYCoord();
	double p3Apothem = p3.getApothem();
	// Print results
	System.out.println("Number of Sides for Polygon 3: " + p3NumSides);
	System.out.println("Side Length for Polygon 3: " + p3SideLength);
	System.out.println("X-Coordinate for Polygon 3: " + p3XCoord);
	System.out.println("Y-Coordinate for Polygon 3: " + p3YCoord);
	System.out.println("Apothem for Polygon 3: " + p3Apothem);
	// Call the Perimeter Method
	double p3Perimeter = p3.getPerimeter();
	// Print results
	System.out.println("Perimeter of Polygon 3 is: " + p3Perimeter);
	
	// Call the Area Method
	double p3Area = p3.getArea();
	// Print results
	System.out.println("The Area of Polygon 3 is: " + p3Area);
	System.out.println("-------------------------------------");
	
	//Call the getter method for Polygon 4
	int p4NumSides = p4.getNumSides();
	double p4SideLength = p4.getSideLength();
	double p4XCoord = p4.getXCoord();
	double p4YCoord = p4.getYCoord();
	double p4Apothem = p4.getApothem();
	// Print results
	System.out.println("Number of Sides for Polygon 4: " + p4NumSides);
	System.out.println("Side Length for Polygon 4: " + p4SideLength);
	System.out.println("X-Coordinate for Polygon 4: " + p4XCoord);
	System.out.println("Y-Coordinate for Polygon 4: " + p4YCoord);
	System.out.println("Apothem for Polygon 4: " + p4Apothem);
	// Call the Perimeter Method
	double p4Perimeter = p4.getPerimeter();
	// Print results
	System.out.println("Perimeter of Polygon 4 is: " + p4Perimeter);
	
	// Call the Area Method
	double p4Area = p4.getArea();
	// Print results
	System.out.println("The Area of Polygon 4 is: " + p4Area);
	System.out.println("-------------------------------------");
	
	//Call the getter method for Polygon 5
	int p5NumSides = p5.getNumSides();
	double p5SideLength = p5.getSideLength();
	double p5XCoord = p5.getXCoord();
	double p5YCoord = p5.getYCoord();
	double p5Apothem = p5.getApothem();
	// Print results
	System.out.println("Number of Sides for Polygon 5: " + p5NumSides);
	System.out.println("Side Length for Polygon 5: " + p5SideLength);
	System.out.println("X-Coordinate for Polygon 5: " + p5XCoord);
	System.out.println("Y-Coordinate for Polygon 5: " + p5YCoord);
	System.out.println("Apothem for Polygon 5: " + p5Apothem);
	// Call the Perimeter Method
	double p5Perimeter = p5.getPerimeter();
	// Print results
	System.out.println("Perimeter of Polygon 5 is: " + p5Perimeter);
	
	// Call the Area Method
	double p5Area = p5.getArea();
	// Print results
	System.out.println("The Area of Polygon 5 is: " + p5Area);
	System.out.println("-------------------------------------");
	

	// Display the values using toString
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p4.toString());
	System.out.println(p5.toString());


    }

}