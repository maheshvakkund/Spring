package com.mahesh.springconfiguration;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Mahesh
 *
 */
public class ConfigurationBeanDemoApp {

	public static void main(String[] args) {
		// read the spring config file
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);) {
			// get the bean from spring container
			SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
			// call the method on the bean
			System.out.println(coach.getDailyFortune());
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getEmail());
			System.out.println(coach.getTeam());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
