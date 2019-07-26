package com.bibleit.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting cage";
	}

	@Override
	public String getDailyForutne() {
		// use the fortuneService to give the fortune
		return fortuneService.getFortune();
	}

}
