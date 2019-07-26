package com.bibleit.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		Coach theCoach = new SoccerCoach();

		// Use the Object
		System.out.println(theCoach.getDailyWorkout());
	}

}
