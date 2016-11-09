package com.ptl.springdemo01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest rep, HttpServletResponse resp) throws Exception {
		ModelAndView modelAndView=new ModelAndView();
		//��תҳ������ֲ���
		modelAndView.setViewName("hello");
		//�൱��������req.setAttribute
		modelAndView.addObject("hello","�������");
		
		return modelAndView;
	}

}
