/*
 * copyright 2018
 * 
 */
package com.jdl.controller.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jdl.entity.EmpEntity;
import com.jdl.service.EmpService;

/**
 * @author jdl time: 2018年10月9日 下午3:31:41
 */
@Controller
public class EditController {

	// 自动注入依赖
	@Autowired
	private EmpService empService;

	@RequestMapping("select")
	public String showMsg(Model model) {
		model.addAttribute("emps", empService.selectAll());
		return "emp";
	}

	/**
	 * 编辑数据 author : jdl
	 * 
	 * @param model
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(Model model, String id, String name) {
		model.addAttribute("emp", empService.selectById(id));
		System.out.println("edit:\t" + name);
		return "edit";
	}

	/**
	 * 这是第一种浏览器传递对象数据的方式,在页面中直接是对象的属性名，不需要加上对象名 因此不能传递具有相同属性名的对象,默认是不支持直接对象.属性值
	 * 但对象的引用属性可以用.来嵌套 比如empEntity.user可以在jsp中user.name接受数据 author : jdl
	 * 
	 * @param empEntity
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(EmpEntity empEntity, Model model) {
		System.out.println(empEntity.getId());
		System.out.println(empEntity.getName());
		System.out.println(empEntity.getAge());
		// 可以通过设置断点来查看数据是否被获得
		return "redirect:select";
	}

	@RequestMapping(value="/json",produces="application/json;charset=UTF-8")
	@ResponseBody
	public EmpEntity findEmp(String name) {
		System.out.println("findEmp:" + name);
		EmpEntity empEntity = new EmpEntity();
		empEntity.setAge(22);
		empEntity.setName("b站姬");
		empEntity.setId("2333333");
		
		return empEntity;
	}
}
