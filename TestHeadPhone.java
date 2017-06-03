/*
*  Filename: TestHeadPhone.java
*  Author: Kyle Post
*  Data: October 1, 2016
*  Purpose: Program constructs
*  instances of the class
*  Headphones and it's methods
*/

import java.util.*;
import java.awt.*;

public class TestHeadPhone { 

public static void main(String[] args){
	//Create Headphone Object with default contructor
	Headphones hp1 = new Headphones();
	
	//Create Headphones objects with parameters (Is it Plugged In, The Number of Volume, Manufacturer, and Headphone Color)
	Headphones hp2 = new Headphones(true, 1, "Samsung", Color.red);
	Headphones hp3 = new Headphones(true, 3, "Samsung", Color.green);
	Headphones hp4 = new Headphones(true, 3, "Samsung", Color.gray);
	
	//Print the string method from Headphones Class
	System.out.println(hp1.toString());
	System.out.println(hp2.toString());
	System.out.println(hp3.toString());
	System.out.println(hp4.toString());
	System.out.println("***********************************************");
	
	//Use Setter Method to change Parameter of HP3
	hp3.setPluggedIn(false);
	hp3.setManufacturer("SongBird");
	
	System.out.println("I used setter method to change Headphone 3, the results are : ");
	System.out.println(hp3.toString());
	System.out.println("***********************************************");
	
	//Call Change Volume Method
	int hp1Volume = hp1.getChangeVolume();
	System.out.println("\n The Volume for Headphones 1 as changed to: " + hp1Volume);
}
}






