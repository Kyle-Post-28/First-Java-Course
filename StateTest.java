/*
* File: StateTest.java
* Author: Kyle Post
* Date: October 9, 2016
* Purpose: This program is able to provide
*the use to input a state and get the output
*of the state bird and flower
*/

// Import statements
import java.util.Scanner;

public class StateTest {	
    public static void main(String[] args)  {
	String[] stateName = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
    String[] stateFlower = {"Camellia", "Forget-me-not", "Saguaro cactus", "Apple blossom", "Golden poppy", "Rocky Mountain Columbine", "Mountain laurel", "Peach blossom", "Orange blossom", "Cherokee rose", "Hibiscus", "Syringa", "Native violet", "Peony", "Wild rose", "Native sunflower", "Goldenrod", "Magnolia", "Pine cone & tassle", "Black Eyed Susan", "Mayflower", "Apple blossom", "Lady slipper", "Magnolia", "Hawthorn", "Bitterroot", "Goldenrod", "Sagebrush", "Purple lilac", "Purple violet", "Yucca", "Rose", "Dogwood", "Wild prairie rose", "Scarlet carnation", "Mistletoe", "Oregon Grape", "Mountain laurel", "Violet", "Yellow jessamine", "Pasque flower", "Purple iris", "Texas Blue Bonnet", "Sego lily", "Red clover", "Dogwood", "Western rhododendron", "Rhododendron", "Wood violet", "Indian paint brush"};
    String[] stateBird = {"Yellowhammer", "Willow Ptarmigan", "Cactus Wren", "Mockingbird", "California Valley Quail", "Lark Bunting", "Robin", "Blue Hen Chicken", "Mockingbird", "Brown Thrasher", "Nene", "Mountain Bluebird", "Cardinal", "Cardinal", "Eastern Goldfinch", "Western Meadowlark", "Cardinal", "Eastern Brown Pelican", "Chickadee", "Baltimore Oriole", "Chickadee", "Robin", "Common Loon", "Mockingbird", "Bluebird", "Western Meadowlark", "Western Meadowlark", "Mountain Bluebird", "Purple Finch", "Eastern Goldfinch", "Roadrunner", "Bluebird", "Cardinal", "Western Meadowlark", "Cardinal", "Scissor-tailed Flycatcher", "Western Meadowlark", "Ruffed Grouse", "Rhode Island Red", "Great Carolina Wren", "Ring-necked Pheasant", "Mockingbird", "Mockingbird", "American Seagull", "Hermit Thrush", "Cardinal", "Willow Goldfinch", "Cardinal", "Robin", "Western Meadowlark"};
	String stop = "None";
	String state1 = " ";
	Scanner scannerIn = new Scanner(System.in);
	while (state1 != stop) {
	System.out.println(" ");
	System.out.println("Enter the name of your State (or none to stop): ");
	state1 = scannerIn.nextLine();
	
	if(state1.equalsIgnoreCase(stop)){
		System.out.println ("You have typed None so this won't continue");
		System.exit(0);
	}
	else{
	for (int i = 0; i < stateName.length; i++) {   
			if (state1.equalsIgnoreCase(stateName[i])){
	   	   System.out.println ("The state you picked is " + stateName[i] + " and is number: " + i);
	   	   System.out.println ("This state's bird is: " +stateBird[i]);
		   System.out.println ("This state's flower is: " +stateFlower[i]);	  	
			}	 
		}
	}
	}			
		System.out.println("******************************************");
	}
}
