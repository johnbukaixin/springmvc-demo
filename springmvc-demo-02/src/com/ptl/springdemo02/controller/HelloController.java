package com.ptl.springdemo02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// �����ʴ�·��ʱ���ҵ��˿�����
	@RequestMapping("/hello.do")
	public String sayHello(Model model) {
		model.addAttribute("hello", "�������");
		return "hello";// ���ص�����ַ���������תĿ��ҳ�������
	}
}
