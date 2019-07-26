package com.bibleit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		// retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods
		System.out.println(theCoach.getDailyWorkout());
		
		// Lets call the new method for fortunes
		System.out.println(theCoach.getDailyForutne());
		// close context
		context.close();
	}

}
