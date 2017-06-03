/*
*  Filename: LineCount.java
*  Author: Kyle Post
*  Data: October 16, 2016
*  Purpose: Program creates a function
*  that reads the afile and counts 
*  the number of lines in the documention
*/

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class LineCount {
    
    
    public static void main(String[] args) {
          try
          {
			  int count=0;
              BufferedReader infile=new BufferedReader(new FileReader(args[0]));
              while(infile.ready())
              {
                  System.out.println(infile.readLine());
                  count++;
                  
              }
              System.out.println("In this file there were " + count + " amount of lines");
          }catch(IOException ex)
          {
              System.out.println(ex.getMessage());
			  System.out.println("Unfortunately, we could not find your file, please try again!");
          }
    }
}
