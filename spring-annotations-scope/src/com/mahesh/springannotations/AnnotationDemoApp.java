package com.mahesh.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mahesh
 *
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);

		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());

		context.close();
	}
}
