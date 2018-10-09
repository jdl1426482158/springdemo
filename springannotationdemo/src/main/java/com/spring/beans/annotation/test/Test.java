/*
 * copyright 2018
 * 
 */
package com.spring.beans.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.beans.annotation.controller.UserController;
import com.spring.beans.annotation.repository.UserRepository;
import com.spring.beans.annotation.service.UserService;

/**
 * @author jdl time: 2018年10月8日 下午1:12:43
 */

@Component
public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Test test = (Test) ctx.getBean("test");
		System.out.println(test);
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		UserRepository userRespository = (UserRepository) ctx.getBean("userRepository");
		System.out.println(userRespository);
	}
}
