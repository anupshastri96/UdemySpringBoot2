package com.anupcodes.spring;

public class BasketBallCoach implements Coach{

	private FortuneService fortuneService;
	
	
	
	public BasketBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	
	
	@Override
	public String getTheDailyExercise() {
		
		return "100 Free throws";
	}

	@Override
	public String getTheDailyFortune() {
		return fortuneService.tellMyFortune();
		
	}

}
