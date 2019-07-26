package com.bibleit.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	// Setup private fields for email and team
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket: inside no-arg constructor");
	}	

	// The setter method created by Spring to inject the dependency.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CriketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyForutne() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CriketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CriketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	
}
