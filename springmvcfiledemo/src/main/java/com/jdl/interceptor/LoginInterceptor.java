/*
 * copyright 2018
 * 
 */
package com.jdl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author jdl time: 2018年10月10日 下午4:07:09
 */
public class LoginInterceptor implements HandlerInterceptor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.
	 * http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println(request.getSession().getAttribute("user"));
		if (request.getSession().getAttribute("user") != null)
			return true;
		else {
			String url = request.getRequestURL().toString();
			System.out.println(url);
			return false;
		}
	}
}
