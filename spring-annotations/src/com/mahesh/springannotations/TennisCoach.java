package com.mahesh.springannotations;

import org.springframework.stereotype.Component;

/**
 * @author Mahesh
 *
 */
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice your back hand volley";
	}
}
