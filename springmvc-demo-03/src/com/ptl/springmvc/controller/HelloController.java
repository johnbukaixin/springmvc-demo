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
		model.addAttribute("hello","�������");
    	return "hello";
	}
    @RequestMapping("/two")
    public String bb(Model model){
    	model.addAttribute("hello","���ǵڶ�����ϰ");
    	//�ض��򲻼�б���Ǳ����·������/�����·�����ض�������ͼ������
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
    	resp.getWriter().println("������");
    	return "hello";
    }
    @RequestMapping("/five")
    public String ee(HttpServletRequest req,HttpServletResponse resp,HttpSession session){
    	String sessionId=session.getId();
    	System.out.println(sessionId);
    	return "hello";
    }
}
