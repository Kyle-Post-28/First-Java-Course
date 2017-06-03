/*Filename: RandomXY
*Author: Kyle Post
*Date: October 9th 2016
*Purpose: An application to generate a random Integer 
*that has values between 0 and Y while using command-line arguments 
*for entry of X and Y.
*/
public class RandomXY {
public static void main(String []args){
//Initialize Variables for Command-Line Arguments
int x = 0;
int y = 0;
//Make sure command-line work, otherwise error and example
	if(args.length !=2){
	System.err.println("\tError: Two command-line arguments required for this program" +
	"\n\n\tEX: java arguments 13 6");
	System.exit(0);
	}

	if(args.length == 2){
	x = Integer.parseInt(args[0]);
	y = Integer.parseInt(args[1]);

		//Use a Loop with Math.random method to generate random numbers
		for (int i = 0; i < x; i++){
		int random = (int)(Math.random () * y);
		System.out.println("Arguments Number " + i + ": Has a value of " + random);
		}
	}
  }
}