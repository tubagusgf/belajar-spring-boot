package com.jajal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ACoba2Controller {
	
	@RequestMapping("/jajal1")
	public String jajal1() {
		return "jajal1";
	}
	
	@RequestMapping("/jajal2")
	@ResponseBody
	public String jajal2() {
		return "ini jajal2";
	}
}
