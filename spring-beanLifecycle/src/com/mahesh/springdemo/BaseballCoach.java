package com.mahesh.springdemo;

/**
 * @author Mahesh
 *
 */
public class BaseballCoach implements Coach {

	FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice baseball 30 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("init-method : doMyStartupStuff");
	}

	public void doMyCleanStuff() {
		System.out.println("destroy-method : doMyCleanStuff");
	}
}
