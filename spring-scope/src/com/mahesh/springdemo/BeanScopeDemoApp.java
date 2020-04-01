package com.mahesh.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mahesh
 *
 */
public class BeanScopeDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScope-applicationContext.xml");) {

			// retrieve bean from spring container
			Coach theCoach = context.getBean("myCoach", Coach.class);
			Coach alphaCoach = context.getBean("myCoach", Coach.class);

			/// check if they are the same
			System.out.println(theCoach == alphaCoach);
			System.out.println("Memory location for thecoach" + theCoach);
			System.out.println("Memory location for alphaCoach" + alphaCoach);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
