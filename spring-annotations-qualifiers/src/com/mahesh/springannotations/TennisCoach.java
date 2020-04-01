package com.mahesh.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Mahesh
 *
 */
@Component
public class TennisCoach implements Coach {
	@Autowired
	/*Specifies that the DatabaseFortune bean has to be mapped*/
	@Qualifier("databaseFortuneService")
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "practice your back hand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
