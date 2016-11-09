package com.ptl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ptl.springmvc.bean.User;
@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping("/user.do")
	public String saveUserData(User user){
		System.out.println(user);
    	User user2=new User();
		user2.setPwd("123");
		user2.setUsername("zhangsan");
		return "success";
	}
    /**
     * 使用普通的方式接收表单数据
     * @param userId
     * @param username
     * @param pwd
     * @return
     */
    @RequestMapping("/one")
    public String param1(int userId,String username,String pwd){
    	System.out.println(userId+" "+username+" "+pwd);
    	return "success";
    }
    @RequestMapping("/two")
    public String param2(@RequestParam(name="userid",required=true)Integer userId,@RequestParam(name="username",required=false,defaultValue="zhangsan")String username,@RequestParam(name="pwd",required=false,defaultValue="123")String pwd){
    	System.out.println(userId+" "+username+" "+pwd);
    	
    	return "success";
    }
    @RequestMapping("/three")
    public String param3(User user){
    	System.out.println(user);
    	return "success";
    }
}
