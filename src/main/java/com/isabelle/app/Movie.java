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

//empty constructor
	public Movie() {

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

	public void Play() {
		// ask user to input mood, using scanner
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Please select a mood from the following list");
		System.out.println("eg. happy");
		System.out.println("Need a laugh: happy");
		System.out.println("Need a good cry: sad");
		System.out.println("Want some adventure: adventurous");
		System.out.println("Anything else: Other");

		String moods = myObj.nextLine(); // Read user input
		System.out.println("how many suggestions would you like?");
		System.out.println("please choose between 1 and 10");

		// array list to store possible movies
		ArrayList<Movie> movieOptions = new ArrayList<Movie>();
		Movie happyMovie1 = new Movie("happy", "Wild Hogs");
		Movie happyMovie2 = new Movie("happy", "Grownups");
		Movie happyMovie3 = new Movie("happy", "DeadPool");
		Movie happyMovie4 = new Movie("happy", "DeadPool2");
		Movie happyMovie5 = new Movie("happy", "Space Jam");
		Movie happyMovie6 = new Movie("happy", "Home Alone");
		Movie happyMovie7 = new Movie("happy", "Ferris Buellers Day Off");
		Movie happyMovie8 = new Movie("happy", "Coming 2 America");
		Movie happyMovie9 = new Movie("happy", "Just Go With It");
		Movie happyMovie10 = new Movie("happy", "Johnny English");

		movieOptions.add(happyMovie1);
		movieOptions.add(happyMovie2);
		movieOptions.add(happyMovie3);
		movieOptions.add(happyMovie4);
		movieOptions.add(happyMovie5);
		movieOptions.add(happyMovie6);
		movieOptions.add(happyMovie7);
		movieOptions.add(happyMovie8);
		movieOptions.add(happyMovie9);
		movieOptions.add(happyMovie10);
		// array list to store possible sadMovies
		ArrayList<Movie> sadMovieOptions = new ArrayList<Movie>();
		Movie sadMovie1 = new Movie("sad", "The fault in our stars");
		Movie sadMovie2 = new Movie("sad", "Paper towns");
		Movie sadMovie3 = new Movie("sad", "The Green Mile");
		Movie sadMovie4 = new Movie("sad", "The Boy In The Striped Pajamas");
		Movie sadMovie5 = new Movie("sad", "Grave Of The FireFlies");
		Movie sadMovie6 = new Movie("sad", "5 Feet Apart");
		Movie sadMovie7 = new Movie("sad", "Marely And Me");
		Movie sadMovie8 = new Movie("sad", "The NoteBook");
		Movie sadMovie9 = new Movie("sad", "Me Before You");
		Movie sadMovie10 = new Movie("sad", "Little Women");

		sadMovieOptions.add(sadMovie1);
		sadMovieOptions.add(sadMovie2);
		sadMovieOptions.add(sadMovie3);
		sadMovieOptions.add(sadMovie4);
		sadMovieOptions.add(sadMovie5);
		sadMovieOptions.add(sadMovie6);
		sadMovieOptions.add(sadMovie7);
		sadMovieOptions.add(sadMovie8);
		sadMovieOptions.add(sadMovie9);
		sadMovieOptions.add(sadMovie10);
		// array list to store possible adventurousMovies
		ArrayList<Movie> adventurousMovieOptions = new ArrayList<Movie>();
		Movie adventurousMovie1 = new Movie("adventurous", "Journey To Mysterious Island");
		Movie adventurousMovie2 = new Movie("adventurous", "Jumanji");
		Movie adventurousMovie3 = new Movie("adventurous", "Journey To The Centre Of The Earth");
		Movie adventurousMovie4 = new Movie("adventurous", "Mulan");
		Movie adventurousMovie5 = new Movie("adventurous", "The Croods");
		Movie adventurousMovie6 = new Movie("adventurous", "Nania");
		Movie adventurousMovie7 = new Movie("adventurous", "The Golden Cumpass");
		Movie adventurousMovie8 = new Movie("adventurous", "The Polar Express");
		Movie adventurousMovie9 = new Movie("adventurous", "Avatar");
		Movie adventurousMovie10 = new Movie("adventurous", "Tarzan");

		adventurousMovieOptions.add(adventurousMovie1);
		adventurousMovieOptions.add(adventurousMovie2);
		adventurousMovieOptions.add(adventurousMovie3);
		adventurousMovieOptions.add(adventurousMovie4);
		adventurousMovieOptions.add(adventurousMovie5);
		adventurousMovieOptions.add(adventurousMovie6);
		adventurousMovieOptions.add(adventurousMovie7);
		adventurousMovieOptions.add(adventurousMovie8);
		adventurousMovieOptions.add(adventurousMovie9);
		adventurousMovieOptions.add(adventurousMovie10);

		int numberOfMovies = myObj.nextInt();
		if (moods.equalsIgnoreCase("happy")) {
			for (int i = 0; i < numberOfMovies; i++)
				System.out.println(movieOptions.get(i));
		} else if (moods.equalsIgnoreCase("sad")) {
			for (int i = 0; i < numberOfMovies; i++)
				System.out.println(sadMovieOptions.get(i));
		} else if (moods.equalsIgnoreCase("adventurous")) {
			for (int i = 0; i < numberOfMovies; i++)
				System.out.println(adventurousMovieOptions.get(i));
		} else {
			System.out.println("Sorry I cant find more movies right now, please check back later!");
		}
	}

}
