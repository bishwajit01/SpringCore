package com.vikram.bishwajit.annotationBasedComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Bishwajit.
 *
 */
@Component
public class Samsung {
	
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor mobileProcessor;
	
	public void specification() {
		System.out.println("Octa core, 256GB 6GB, Quad Rear Camera, SuperSlow Camera");
		mobileProcessor.process();
	}
}
