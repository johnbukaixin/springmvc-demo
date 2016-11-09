package com.ptl.springmvc.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptl.springmvc.bean.User;

@Controller
@RequestMapping("/user")
public class AjaxController {
	@RequestMapping(value="textAjax",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
	public User textAjax(User user){
		System.out.println("AjaxController.textAjax()");
    	System.out.println(user);
    	User user2=new User();
    	user2.setPwd("111");
    	user2.setUsername("zhangsan");
    	return user2;
    }
	@RequestMapping(value="jsonAjax",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public User jsonAjax(User user){
		System.out.println("AjaxController.jsonAjax()");
		System.out.println(user);
		User user2=new User();
		user2.setPwd("111");
		user2.setUsername("zhangsan");
		return user2;
	}
	
	
}
