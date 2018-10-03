/*
 * copyright 2018
 * 
 */
package com.tutorialspoint;

import java.lang.reflect.Method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义事件就是包括
 * 1. 发布事件
 * 2. 事件定义
 * 3. 事件处理
 * 只要将实现特定接口的类定义到Beans.xml中即可实现绑定
 * 
 * @author jdl
 *
 * time: 2018年10月3日 上午8:29:57
 */
public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();
	}
}