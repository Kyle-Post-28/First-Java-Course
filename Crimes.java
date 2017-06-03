/*
*  Filename: Crimes.java
*  Author: Kyle Post
*  Data: October 16, 2016
*  Purpose: Program creates a Crimes class
*  that reads the Crime.csv file and enters 
*  as an array list and then get method for
* main application
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Crimes{
    public ArrayList<String[]> crimeData = new ArrayList<String[]> ();
    public Crimes() {
		BufferedReader readfile = null;
		String filename = "C:/Users/Kyle Post/Desktop/Crime.csv";
		
                try {
			String line;
			readfile = new BufferedReader(new FileReader(filename));			
			
			while ((line = readfile.readLine()) != null) {
				crimeData.add(line.split(","));
			}
                   } 
                      
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
   
    }
//Use Getter Method
    
    public String getData(int row, int column){
        return crimeData.get(row)[column];
    }
    public int getMurderRateHigh(int index){
          return Integer.parseInt(getData(index,0));
    }
    public int getMurderRateLow(int index){
          return Integer.parseInt(getData(index,0));
    }
    public int getRobberyRateHigh(int index){
          return Integer.parseInt(getData(index,0));
    }
    public int getRobberyRateLow(int index){
          return Integer.parseInt(getData(index,0));
    }
    public float getBurglaryRateDifference(){
          return Float.parseFloat(getData(1,15))
                  - Float.parseFloat(getData(20,15));
    }
    public int getViolentCrimes(){
          return Integer.parseInt(getData(17,2))
                  + Integer.parseInt(getData(18,2))
                  + Integer.parseInt(getData(19,2))
                  + Integer.parseInt(getData(20,2));
    }
    public float getMotorVehicleThefts(){
          return (Float.parseFloat(getData(5,19))
                  - Float.parseFloat(getData(19,19)))
                  / Float.parseFloat(getData(5,19));
    }
    public float getPopulationGrowth(int index){
          return ((Float.parseFloat(getData(index + 1,1))
                  - Float.parseFloat(getData(index,1)))
                  / Float.parseFloat(getData(index + 1,1)))
                  * 100;
                  
    }
}