package com.anupcodes.spring;

public class CricketCoach implements Coach{

	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Circket Coach:inside setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Circket Coach:inside setTeam()");
		this.team = team;
	}
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("Circket Coach:inside No-args Constuctor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Circket Coach:inside setFortuneService()");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getTheDailyExercise() {
		return "Practice fast bowling for 4 hrs";
	}

	@Override
	public String getTheDailyFortune() {
		int number = randomWithRange(1, 3);
		String output = (number == 1)?"Today is not a good day":(number == 2)?"Today is a hardworking day":fortuneService.tellMyFortune();
		return output;
	}
	
	private int randomWithRange(int min, int max) {
		
		int range = (max -min)+1;
		
		return (int)(Math.random()*range)+min;
		
	}
	

}
