/*
 * copyright 2018
 * 
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author jdl
 *
 *         time: 2018年10月3日 上午8:28:29
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}
}