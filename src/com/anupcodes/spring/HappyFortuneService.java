package com.anupcodes.spring;

public class HappyFortuneService implements FortuneService{

	@Override
	public String tellMyFortune() {
		return "Today is your lucky day";
	}

}
