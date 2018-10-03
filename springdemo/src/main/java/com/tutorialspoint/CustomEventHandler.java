/*
 * copyright 2018
 * 
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

/**
 * @author jdl
 *
 *         time: 2018年10月3日 上午10:30:13
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}
}
