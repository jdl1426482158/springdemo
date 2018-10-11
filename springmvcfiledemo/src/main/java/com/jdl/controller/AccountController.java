/*
 * copyright 2018
 * 
 */
package com.jdl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jdl time: 2018年10月10日 下午4:15:00
 */
@Controller
public class AccountController {

	@RequestMapping("login")
	public String login(HttpSession httpSession, String user, String pwd) {

		if (httpSession.getAttribute("user") != null)
			return "uploadOneFile";

		if (user == null || pwd == null || !user.equals("admin") || !pwd.equals("admin"))
			return "login";
		else {
			httpSession.setAttribute("user", "admin");
			/////////////////////////////////////////////////////////////////////////////////
			return "redirect:uploadOneFile";
		}
	}
}
