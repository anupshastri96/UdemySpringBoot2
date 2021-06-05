package com.anupcodes.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach= context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(coach.getTheDailyExercise());
		
		System.out.println(coach.getTheDailyFortune());
		
		System.out.println(coach.getEmailAddress());
		
		System.out.println(coach.getTeam());
		
		context.close();
		
	}

}
