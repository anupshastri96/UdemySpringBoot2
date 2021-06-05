package com.anupcodes.spring;

public class HockeyCoach implements Coach{

	private FortuneService fortuneService;
	
	
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getTheDailyExercise() {
		
		return "run on the field with hockey sticks fo 70 minutes";
	}

	@Override
	public String getTheDailyFortune() {
		return fortuneService.tellMyFortune();
	}

}
