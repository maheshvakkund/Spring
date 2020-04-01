package com.mahesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mahesh
 *
 */
public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring cofiguration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean from the spring container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getFortune());
		// close the context
		context.close();
	}
}
