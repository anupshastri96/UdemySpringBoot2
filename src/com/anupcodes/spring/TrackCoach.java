package com.anupcodes.spring;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach,DisposableBean {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getTheDailyExercise() {
		return "run hard 5k";

	}

	@Override
	public String getTheDailyFortune() {
		return "JUST DO IT! "+ fortuneService.tellMyFortune();
	}

	
	public void doMyStartUpStuff() {
		System.out.println("Inside TrackCoach: doMyStartUpStuff()");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Inside TrackCoach: doMyCleanUpStuff()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside TrackCoach: doMyCleanUpStuff()");
		
	}
	
}
