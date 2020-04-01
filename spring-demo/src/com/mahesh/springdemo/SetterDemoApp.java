/**
 * 
 */
package com.mahesh.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mahesh
 *
 */
public class SetterDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			// load the spring configuration file

			// retrieve the bean from spring container
			CricketCoach coach = context.getBean("mycricketCoach", CricketCoach.class);
			// call the methods on the bean
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getFortune());
			System.out.println(coach.getTeam());
			System.out.println(coach.getEmailAddress());
			// close the context
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
