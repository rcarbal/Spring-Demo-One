package com.bibleit.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortunService) {
		this.fortuneService = fortunService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyForutne() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// Add a destroy menthod
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside method doMyDestroyStuff");
	}

}
