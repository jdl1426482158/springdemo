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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这是通过注解来使用spring mvc 方法前面的RequestMapping中开头/可加可不加
 * 
 * @author jdl time: 2018年10月8日 下午9:17:25
 */
@Controller
//给类名定义RequestMapping就是url里的路径多加了一级
@RequestMapping("/test")
public class SimpleController {

	/**
	 * 多个连接对应同一个方法 author : jdl
	 * 
	 * @return 的包含模型数据和视图名称（即文件名称）
	 */
	@RequestMapping(value = { "hello", "/hello1" }, method = RequestMethod.GET)
	public ModelAndView showHello() {
		System.out.println("hello");
		ModelAndView mv = new ModelAndView();
		// 相当于servlet中的forward的传递参数，键值对形式
		mv.addObject("msg", "hello world1!,this is without facets");
		// 设置对应jsp文件名
		mv.setViewName("hello");
		return mv;
	}

	/**
	 * 这是ModelAndView的简化版,但意义同上 author : jdl
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "hello2", method = RequestMethod.GET)
	public String showHelloTow(Model model) {
		model.addAttribute("msg", "hello world2!,this is without facets");
		return "hello";
	}

	/**
	 * 获取浏览器提交的参数 这里的参数id的名字必须和url?后面的参数名字一致 author : jdl
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "hello3", method = RequestMethod.GET)
	public String showHelloThree(Model model, Integer id) {
		System.out.println(id);
		model.addAttribute("msg", "hello world3!,this is without facets");
		return "hello";
	}

	/**
	 * 把路径本身作为参数的一部分传入，其中{}内的名字必须和方法形参的名字要一致 注解不要忘了 author : jdl
	 * 
	 * @param model
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "hello4/{name}", method = RequestMethod.GET)
	public String showHelloFour(Model model, @PathVariable String name) {
		System.out.println(name);
		model.addAttribute("msg", "hello world4!,this is without facets");
		return "hello";
	}

	/**
	 * 通过？后面的参数对应value中的名字来获取值 author : jdl
	 * 
	 * @param model
	 * @param empId
	 * @return
	 */
	@RequestMapping(value = "hello5", method = RequestMethod.GET)
	public String getParam(Model model,
			@RequestParam(value = "id", required = false, defaultValue = "123") Integer empId) {
		System.out.println(empId);
		return null;
	}
	
	@RequestMapping("show")
	public String show(Model model,@RequestParam(value="msg",required=true,defaultValue="helloworld" ) String msg) {
		model.addAttribute("msg", msg);
		return "show";
	}
}
