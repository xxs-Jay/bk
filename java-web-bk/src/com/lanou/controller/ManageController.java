package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {
	
	
	
	@RequestMapping("manger")
	public String name() {
		return "login";
	}
	

}
