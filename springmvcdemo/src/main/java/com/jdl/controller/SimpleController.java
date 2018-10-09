/*
 * copyright 2018
 * 
 */
package com.jdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 给类名定义RequestMapping就是url里的路径多加了一级
 * 方法前面的RequestMapping中开头/可加可不加
 * 
 * @author jdl time: 2018年10月8日 下午9:17:25
 */
@Controller
@RequestMapping("/test")
public class SimpleController {

	@RequestMapping(value = {"hello","/hello1"}, method = RequestMethod.GET)
	public ModelAndView showHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello world1!,this is without facets");
		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping(value = "hello2", method = RequestMethod.GET)
	public String showHelloTow(Model model) {
		model.addAttribute("msg", "hello world2!,this is without facets");
		return "hello";
	}
	
	//这里的参数id的名字必须和url?后面的参数名字一致
	@RequestMapping(value = "hello3", method = RequestMethod.GET)
	public String showHelloThree(Model model,Integer id) {
		System.out.println(id);
		model.addAttribute("msg", "hello world3!,this is without facets");
		return "hello";
	}
	
	@RequestMapping(value = "hello4/{name}", method = RequestMethod.GET)
	public String showHelloFour(Model model,@PathVariable  String name) {
		System.out.println(name);
		model.addAttribute("msg", "hello world4!,this is without facets");
		return "hello";
	}

}
