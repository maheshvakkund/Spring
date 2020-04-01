/**
 * 
 */
package com.mahesh.springdemo;

/**
 * @author Mahesh
 *
 */
public class MyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
