/* 
 * Filename: Oven.java
 * Author: Kyle Post
 * Date: October 1, 2016
 * Purpose: Program constructs
*  instances of the class
*  Oven and it's methods
 */
 
 // Create Oven
 public class Oven {
 
 	//Declare Variables
    private boolean ovenOn = false;
	private String onOff;
	private int temperature = 0;
    private int preheatTime = 0;
    
    // Default constructor with No Parameters
    public Oven (){
        ovenOn = false;
		temperature = 0;
        preheatTime = 0;
    }
    
    // Constructor with parameters of temperature and preheat time
    public Oven(boolean swit, int temp, int preh){
        ovenOn = swit;
		temperature = temp;
        preheatTime = preh;
    }
    
    // getter methods
	public String getOvenOn() {
		if(ovenOn){
			onOff = "ON and preparing to cook";
		} else{
			onOff = "OFF and needs to be turned on";
		}
		return onOff;
	}
	public int getTemperature(){
        return temperature;
    }
    
    public int getPreheatTime(){
        return preheatTime;
    }
    //toString formats the info and places it in a string to be returned
	public String toString() {
		if(ovenOn){
			onOff = "ON and preparing to cook";
		} else{
			onOff = "OFF and needs to be turned on";
		}
		String results ="\n   Oven status: " + onOff + 
						"\n   Current Temperature: " + temperature + " degrees" + 
						"\n   Time needed for oven to prheat: " + preheatTime + " minutes"; 
		return results;
	} 
 }
 