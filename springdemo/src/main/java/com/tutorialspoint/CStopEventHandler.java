/*
 * copyright 2018
 * 
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author jdl
 *
 *         time: 2018年10月3日 上午8:29:32
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStoppedEvent Received");
	}
}