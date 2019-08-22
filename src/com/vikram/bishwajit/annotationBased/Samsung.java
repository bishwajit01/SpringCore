package com.vikram.bishwajit.annotationBased;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Bishwajit.
 *
 */
public class Samsung {
	
	@Autowired
	MobileProcessor mobileProcessor;
	
	public void specification() {
		System.out.println("Octa core, 256GB 6GB, Quad Rear Camera, SuperSlow Camera");
		mobileProcessor.process();
	}
}
