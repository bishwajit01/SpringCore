/**
 * 
 */
package com.vikram.bishwajit.beanProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vikram.bishwajit.beanProperties.Triangle;

/**
 * @author Bishwajit.
 *
 */

public class DrawingApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_bean_properties.xml");
		Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle-alias");
		triangle1.draw();
		triangle2.draw();
	}

}
