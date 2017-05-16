package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping("login.do")
	public String login() {
		System.out.println("login");
		return "app";
	}	

}
