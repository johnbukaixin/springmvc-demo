package com.ptl.springdemo02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// 当访问此路径时，找到此控制器
	@RequestMapping("/hello.do")
	public String sayHello(Model model) {
		model.addAttribute("hello", "你好世界");
		return "hello";// 返回的这个字符串就是跳转目的页面的名字
	}
}
