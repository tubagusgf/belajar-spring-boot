package com.jajal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.jajal.object.InfoObj;

@Controller
public class Gthymeleaf1Controller {

	@GetMapping("/page1")
	public String page1(ModelMap model) {
		
		InfoObj a = new InfoObj(5, "ini info 5");
		InfoObj b = new InfoObj(9, "ini isi info 9");
		
		List<InfoObj> listObj = new ArrayList<InfoObj>();
		
		listObj.add(a);
		listObj.add(b);
		
		model.addAttribute("coba", "ini coba var");
		model.addAttribute("jajal", "ini isi jajal var");
		model.addAttribute("obja", a);
		model.addAttribute("infoList", listObj);
		
		return "page1";
	}
	
}
