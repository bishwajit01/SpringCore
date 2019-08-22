/**
 * 
 */
package com.vikram.bishwajit.autowiringByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vikram.bishwajit.autowiringByConstructor.Triangle;

/**
 * @author Bishwajit.
 *
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_autowiringByConstructor.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();

	}

}
