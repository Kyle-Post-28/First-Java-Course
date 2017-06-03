/*
*  Filename: Headphones.java
*  Author: Kyle Post
*  Data: October 1, 2016
*  Purpose: Program constructs
*  instances of the class
*  Headphones and it's methods
*/

import java.util.*;
import java.awt.*;

//create Headphones class
public class Headphones {
	private static final int LOW = 1;
	private static final int MEDIUM = 2;
	private static final int HIGH = 3;
	private int volume = MEDIUM;
	private boolean pluggedIn = false;
	private String manufacturer;
	private Color headPhoneColor;
	
	//Default Constructor (no arguments given)
	public Headphones () {
	pluggedIn = false;
	volume = MEDIUM;
	manufacturer = "Apple";
	headPhoneColor = Color.blue;	
	}
	
	//Constructor with arguments
	public Headphones (boolean inOut, int vol, String manu, Color hPCol) {
	pluggedIn = inOut;
	volume = vol;
	manufacturer = manu;
	headPhoneColor = hPCol;	
	}
	
	//Setter Method
	public void setPluggedIn(boolean inOut){
	pluggedIn = inOut;
	}
	public void setVolume(int vol){
	volume = vol;
	}
	public void setManufacturer(String manu){
	manufacturer = manu;
	}
	public void setHeadPhoneColor(Color hPCol){
	headPhoneColor = hPCol;
	}
	
	// Getter Method
	public boolean getPluggedIn(){
	return pluggedIn;
	}
	public int getVolume(){
	return volume;
	}
	public String getManufacturer(){
	return manufacturer;
	}
	public Color getHeadPhoneColor(){
	return headPhoneColor;
	}
	
	//Use change volume method
	public int getChangeVolume() {
		if (volume >= 3){
			volume--;
			return volume;
		}
		else {
			volume++;
			return volume;
		}
	}
	//Create toString that organizes information and outputs it into a string
	public String toString() {
		String str ="\n   Headphones are Plugged In: " + pluggedIn + 
						"\n   Headphones Volume: " + volume + 
						"\n   Headphones Manufacturer: " + manufacturer + 
						"\n	  Headphones Color: " + headPhoneColor;
		return str;
	}
}