/*
 * copyright 2018
 * 
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

/**
 * @author jdl
 *
 *         time: 2018年10月3日 上午10:27:01
 */
public class CustomEvent extends ApplicationEvent {

	/**
	 * @param source
	 */
	public CustomEvent(Object source) {
		super(source);
		System.out.println("CustomEvent constructor");
	}

	public String toString() {
		return "My Custom Event";
	}
}
