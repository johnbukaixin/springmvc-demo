package com.ptl.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ptl.springmvc.bean.User;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,HttpSession session){
		System.out.println("UserController.login()");
		System.out.println(user);
		if("zhangsan".equals(user.getUsername())&&"123".equals(user.getPwd())){
			session.setAttribute("user", user);
			return "redirect:/index.html";
		}
		return "redirect:/login.jsp";
	}
	@RequestMapping("getUsers")
	public String getUsers(Model model){
		List<User> users=new ArrayList<>();
		User user=null;
		for(int i=0;i<10;i++){
			user=new User();
			user.setUserid(i);
			user.setUsername("name"+i);
			user.setPwd("pwd"+i);
			users.add(user);
		}
		model.addAttribute("users", users);
		return "success";
	}
}
