package com.mahesh.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Mahesh
 *
 */
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "practice your back hand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("init-method : doMyStartupStuff");
	}

	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println("destroy-method : doMyCleanStuff");
	}

}
