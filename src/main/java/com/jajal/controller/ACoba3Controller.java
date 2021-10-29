package com.jajal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ACoba3Controller {
	
	@RequestMapping("/jajal3")
	public String jajal3() {
		return "ini jajal3";
	}
	
	@RequestMapping("/jajal4")
	public String jajal4() {
		return "ini jajal4";
	}
}
