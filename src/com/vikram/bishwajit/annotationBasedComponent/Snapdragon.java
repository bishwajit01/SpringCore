/**
 * 
 */
package com.vikram.bishwajit.annotationBasedComponent;

import org.springframework.stereotype.Component;

/**
 * @author Bishwajit
 *
 */
@Component
public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Processor :: SnapDragon 656");
	}

}
