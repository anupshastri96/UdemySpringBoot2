package com.anupcodes.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myTrackCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myTrackCoach",Coach.class);
		
		System.out.println(coach==alphaCoach);
		
		System.out.println(coach);
		
		System.out.println(alphaCoach);

	}

}
