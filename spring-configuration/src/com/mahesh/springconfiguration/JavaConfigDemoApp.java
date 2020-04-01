package com.mahesh.springconfiguration;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Mahesh
 *
 */
public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read the spring config file
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);) {
			// get the bean from spring container
			Coach coach = context.getBean("tennisCoach", Coach.class);
			// call the method on the bean
			System.out.println(coach.getDailyFortune());
			System.out.println(coach.getDailyWorkout());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
