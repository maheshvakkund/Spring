/**
 * 
 */
package com.mahesh.springdemo;

/**
 * @author Mahesh
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// add new fields for email address and team
	private String emailAddress;
	private String team;

	// create a no argument constructor;
	public CricketCoach() {
		System.out.println("Inside a no arg constructor-CricketCoach");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice bowling for 15minutes";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

	/**
	 * our setter method
	 * 
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside a setter method :Fortune Service");
		this.fortuneService = fortuneService;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside a setter method : Email Address");
		this.emailAddress = emailAddress;
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
		System.out.println("Inside a setter method :Team");
		this.team = team;
	}

}
