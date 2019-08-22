package com.vikram.bishwajit.annotationBasedComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author Bishwajit.
 *
 */
public class PhoneApp {
	public static void main(String[] args) {

		// for annotation we should use the 4.1.9.RELEASE version of Spring Context.

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PhoneSpecification.class);
		Samsung samsung = applicationContext.getBean(Samsung.class);
		samsung.specification();
	}
}
