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
 * @author jdl
 *
 *         time: 2018年10月3日 上午8:29:57
 */
public class MainApp {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// Let us raise a start event.
		context.start();

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.getMessage();

		// Let us raise a stop event.
		context.stop();

//		// 看出这还是利用了反射来实现
//		Class clazz = CStopEventHandler.class;
//		Method[] methods = clazz.getDeclaredMethods();
//		System.out.println(clazz.getMethod("onApplicationEvent", ContextStoppedEvent.class));
	}
}