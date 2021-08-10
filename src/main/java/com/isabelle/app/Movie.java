package com.isabelle.app;

import java.util.ArrayList;

import java.util.Arrays;

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
	 
	//loop through array list and select three movies based on mood (start with one)
	
	//if happy -- movie1 movie2 movie3
	
	//if sad -- movie1 movie2 movie3
	
	//if angry -- movie1 movie2 movie3
	
	//other(else) -- movie1 movie2 movie3
	
	
	
}
