/*
* File: Polygon.java
* Author: Kyle Post
* Date: September 18, 2016
* Purpose: This program constructs instances
* of the Polygon class and uses
* its methods
*/

public class Polygon {    
    private int numSides;
	private double sideLength;
	private double xCoord;
    private double yCoord;
	private double apothem;
	private double perimeter = 20;
   
    // Default constructor with no arguments
    public Polygon () {		
	numSides = 4;
	sideLength = 10.0;
	xCoord = 0.0;
	yCoord = 0.0;
	apothem = 5.0;      
    }
	
    // Constructor with the following arguments
    public Polygon (int ps, double pslen, double px, double py, double pa) { 
	numSides = ps;
	sideLength = pslen;
	xCoord = px;
	yCoord = py;
	apothem = pa;	
    }
    
    // Setter methods 
    // setNumSides
    public void setNumSides(int ps){
    numSides = ps;	
    }
    //setSideLength
	public void setSideLength(double pslen){
	sideLength = pslen;	
	}
	// setXCoord
    public void setXCoord(double px) {
	xCoord = px;
    }
    // setYCoord
   public void setYCoord(double py)  {	
	yCoord = py;
    }
	//setApothem
	public void setApothem(double pa){
	apothem = pa;	
	}
	
   // Getter methods
    //getNumSides
	public int getNumSides() {
	return numSides;
	}
    //getSideLength
	public double getSideLength() {
	return sideLength;
	}
	// getXCoord
    public double getXCoord() {
	return xCoord;
    }    
    // getYCoord
    public double getYCoord() {
	return yCoord;
    }
	//getApothem
	public double getApothem() {
	return apothem;
	}
   
    // Use Math method to get the perimeter
    public double getPerimeter(){
		
		//Polygon Perimeter Formula
		double perimeter = numSides * sideLength;
		return perimeter;
	}
	//Use Math method to get the area
	public double getArea() {
      
	  // Polygon Area formula
      double area = (0.5 * apothem) * getPerimeter();
      return area;
    }

   
    // toString method
    public String toString() {
	String str = "(" + numSides + ", " + sideLength + ", " + xCoord + ", " + yCoord + ", " + apothem + ")";
	return str;
    }
   
}