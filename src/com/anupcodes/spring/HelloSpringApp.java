package com.anupcodes.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myTrackCoach",Coach.class);
		
		System.out.println(coach.getTheDailyExercise());
		
		System.out.println(coach.getTheDailyFortune());
		
		context.close();
		
		

	}

}
