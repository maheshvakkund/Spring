package com.mahesh.springdemo;

/**
 * @author Mahesh
 *
 */
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 5000m for 30mins";
	}

	@Override
	public String getFortune() {

		return null;
	}

}
