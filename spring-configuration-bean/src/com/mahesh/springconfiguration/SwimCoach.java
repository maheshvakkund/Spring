package com.mahesh.springconfiguration;

/**
 * @author Mahesh
 *
 */
public class SwimCoach implements Coach {

	private FortuneService fotuneService;

	public SwimCoach(FortuneService fotuneService) {
		super();
		this.fotuneService = fotuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000m as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fotuneService.getFortune();
	}

}
