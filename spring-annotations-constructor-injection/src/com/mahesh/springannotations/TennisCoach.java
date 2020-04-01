package com.mahesh.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Mahesh
 *
 */
@Component
public class TennisCoach implements Coach {
	FortuneService fortuneService;

	/**
	 * Define a default Constructor
	 */
	public TennisCoach() {
		System.out.println("Inside no arg constructor: Tennis Coach");
	}

	@Override
	public String getDailyWorkout() {
		return "practice your back hand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/**
	 * 
	 * define a setter method
	 * 
	 * @param fortuneService the fortuneService to set
	 */
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter of fortune service ");
		this.fortuneService = fortuneService;
	}

}
