package com.isabelle.app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello!" );
      
    //ask user to input mood
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select a mood from the following list");
        System.out.println("eg. happy 3");
        System.out.println("Need a laugh: happy");
        System.out.println("Need a good cry: sad");
        System.out.println("Want some adventure: adventurous");
        System.out.println("Other");

        String moods = myObj.nextLine();  // Read user input
        System.out.println("how many suggestions would you like"); 
        int numberOfMovies = myObj.nextInt();
//        System.out.println("Mood is: " + mood);  // Output user input
        
        
   	//array list to store possible movies
    	ArrayList<Movie> movieOptions = new ArrayList<Movie>();
    	Movie happyMovie1 = new Movie ("happy", "Wild Hogs");
    	Movie happyMovie2 = new Movie ("happy", "Grownups");

    	movieOptions.add(happyMovie1);
    	movieOptions.add(happyMovie2);
    	
    	
    	ArrayList<Movie> sadMovieOptions = new ArrayList<Movie>();
    	Movie sadMovie1 = new Movie ("sad", "The fault in our stars");
    	Movie sadMovie2 = new Movie ("sad","Paper towns");
    	sadMovieOptions.add(sadMovie1);
    	sadMovieOptions.add(sadMovie2);
    	//create more movies, add to movieOptions
    	
    	
    	//loop through movieOptions (for loop) and print out those with a matching mood
//    	for (Movie : movieOptions) 
// 
    	
    	
            if (moods.equalsIgnoreCase ("happy")){
            	for (int i = 0; i < numberOfMovies; i++)
                System.out.println (movieOptions.get(i));}
            else if (moods.equalsIgnoreCase ("sad")){
            	for (int i = 0; i< numberOfMovies; i++)
                System.out.println ( sadMovieOptions.get(i));}
    	}
    	//be aware of case (ignore case)
    
    
    	
    	
//    	  Scanner input = new Scanner ( System.in );
//          
//          String mood; 
//     
//         System.out.print("Please enter your name: ");
//        mood = input.nextLine();
//        
//                     
//         if (mood.equalsIgnoreCase ("happy")){
//        System.out.println (mood + "!");}
//        
//            else if (mood.equalsIgnoreCase ("sad")){
//             System.out.println ("Hello " + mood + "!");}
//         
//        
//            else {System.out.println ( mood + "? never heard of them.");} 
//               
//        input.close();
        
         
     


    
	

}
