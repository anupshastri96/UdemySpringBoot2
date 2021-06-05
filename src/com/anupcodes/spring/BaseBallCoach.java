package com.anupcodes.spring;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getTheDailyExercise() {
		return "Do 30 minutes od situps";
	}



	@Override
	public String getTheDailyFortune() {
		return fortuneService.tellMyFortune();
	}

}
