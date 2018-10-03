/*
 * copyright 2018
 * 
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author jdl
 *
 *         time: 2018年10月3日 上午10:27:55
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}
}
