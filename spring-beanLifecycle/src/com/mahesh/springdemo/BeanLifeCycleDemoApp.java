package com.mahesh.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mahesh
 *
 */
public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");) {

			// retrieve bean from spring container
			Coach theCoach = context.getBean("myCoach", Coach.class);
			System.out.println(theCoach.getDailyWorkout());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
 