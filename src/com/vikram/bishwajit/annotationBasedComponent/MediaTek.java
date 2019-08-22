package com.vikram.bishwajit.annotationBasedComponent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Bishwajit
 *
 */
@Component
@Primary
public class MediaTek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("MediaTek :: Used By Motorola");
	}

}
