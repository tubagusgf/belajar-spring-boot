package com.jajal.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmethodArgumentController {
	
	@GetMapping("/method1")
	public String method1(HttpServletRequest req, HttpSession session) {
		System.out.println(req.getRemoteAddr());
		
		Enumeration<String> headerNames = req.getHeaderNames();
		if (headerNames != null) {
			System.out.println("header : ");
			while (headerNames.hasMoreElements()) {
				String headerName = (String) headerNames.nextElement();
				System.out.println(headerName + " : " + req.getHeader(headerName));
			}
		}
		
		System.out.println(session.getId());
		return "ok";
	}
}
