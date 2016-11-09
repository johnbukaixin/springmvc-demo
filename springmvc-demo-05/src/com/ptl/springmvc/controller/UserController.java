package com.ptl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptl.springmvc.bean.User;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("/dateChange")
	public String dateChange(User user){
		System.out.println(user);
		return "success";
	}
}
