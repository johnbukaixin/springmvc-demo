package com.ptl.springmvc.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/one")
	public String sayHello(Model model){
		model.addAttribute("hello","你好世界");
    	return "hello";
	}
    @RequestMapping("/two")
    public String bb(Model model){
    	model.addAttribute("hello","这是第二个练习");
    	//重定向不加斜杠是表相对路径，加/表绝对路径，重定向不走视图解析器
    	return "redirect:/hello.jsp";
    }
    @RequestMapping("/three")
    public String cc(HttpServletRequest req) throws UnsupportedEncodingException{
    	req.setCharacterEncoding("utf-8");
    	String reqStr=req.getParameter("name");
    	System.out.println(reqStr);
    	return "hello";
    }
    @RequestMapping("/four")
    public String dd(HttpServletResponse resp) throws IOException{
    	resp.getWriter().println("哈哈哈");
    	return "hello";
    }
    @RequestMapping("/five")
    public String ee(HttpServletRequest req,HttpServletResponse resp,HttpSession session){
    	String sessionId=session.getId();
    	System.out.println(sessionId);
    	return "hello";
    }
}
