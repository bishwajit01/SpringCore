package com.vikram.bishwajit.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Bishwajit.
 *
 */
public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_constructorInjection.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
		triangle.draw();
	}
}
