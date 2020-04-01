package com.mahesh.springconfiguration;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Mahesh
 *
 */
public class SwimCoach implements Coach {

	private FortuneService fotuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

}
