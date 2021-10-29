package com.jajal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ACoba1Controller {
	
	@RequestMapping("/coba1")
	public String coba1() {
		return "Ini coba 1";
	}
	
}
