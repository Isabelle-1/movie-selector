package com.isabelle.app;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {

//store mood and title

	private String mood;

	private String title;

//constructor
	public Movie(String mood, String title) {
		super();
		this.mood = mood;
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// loop through array list and select three movies based on mood (start with
	// one)

	// if happy -- movie1 movie2 movie3

	// if sad -- movie1 movie2 movie3

	// if angry -- movie1 movie2 movie3

	// other(else) -- movie1 movie2 movie3

	public void Play() {
		// ask user to input mood
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Please select a mood from the following list");
		System.out.println("eg. happy 3");
		System.out.println("Need a laugh: happy");
		System.out.println("Need a good cry: sad");
		System.out.println("Want some adventure: adventurous");
		System.out.println("Other");

		// array list to store possible movies
		ArrayList<Movie> movieOptions = new ArrayList<Movie>();
		Movie happyMovie1 = new Movie("happy", "Wild Hogs");
		Movie happyMovie2 = new Movie("happy", "Grownups");

		movieOptions.add(happyMovie1);
		movieOptions.add(happyMovie2);

		ArrayList<Movie> sadMovieOptions = new ArrayList<Movie>();
		Movie sadMovie1 = new Movie("sad", "The fault in our stars");
		Movie sadMovie2 = new Movie("sad", "Paper towns");
		sadMovieOptions.add(sadMovie1);
		sadMovieOptions.add(sadMovie2);

		String moods = myObj.nextLine(); // Read user input
		System.out.println("how many suggestions would you like");
		int numberOfMovies = myObj.nextInt();
		if (moods.equalsIgnoreCase("happy")) {
			for (int i = 0; i < numberOfMovies; i++)
				System.out.println(movieOptions.get(i));
		} else if (moods.equalsIgnoreCase("sad")) {
			for (int i = 0; i < numberOfMovies; i++)
				System.out.println(sadMovieOptions.get(i));
		}
	}



}
