package com.ptl.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("file")
public class FileController {

	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(MultipartFile myFile,String desc,HttpServletRequest request){
		System.out.println(desc);
		//获取upload本地绝对路径
		String basePath=request.getServletContext().getRealPath("/upload");
		System.out.println(basePath);
		//获得文件名含扩展名
		String file=myFile.getOriginalFilename();
		File newFile=new File(basePath+File.separator+file);
		try {
			myFile.transferTo(newFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return "success";
	}
	@RequestMapping(value="uploadMany",method=RequestMethod.POST)
	public String uploadMany(@RequestParam(name="myFile")MultipartFile[] myFile,String desc,HttpServletRequest request){
		String basePath=request.getServletContext().getRealPath("/upload");
		for (MultipartFile file : myFile) {
			String newFile=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		    String name=UUID.randomUUID().toString();
		    File dest=new File(basePath+File.separator+name+newFile);
		    try {
				file.transferTo(dest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return "success";
	}
}
