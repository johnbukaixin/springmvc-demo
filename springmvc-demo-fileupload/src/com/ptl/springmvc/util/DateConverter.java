package com.ptl.springmvc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

	private final static SimpleDateFormat sdf=new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ");
	@Override
	public Date convert(String date) {
		System.out.println(date);
		try {
			Date newDate=sdf.parse(date);
			return newDate;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
   
}
