package com.khadri.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		System.out.println("homePage()");
		return "home";
	}
	
	
	@RequestMapping(value = "/get/message",method = RequestMethod.POST)
	public String getWishMessage() {
		System.out.println("getWishMessage()");
		
		return "success";
	}
}
