package com.jajal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * memakai prefix /api
 * @author fauzy
 *
 */
@RestController
@RequestMapping("/api")
public class BreqMap2Controller {

	@GetMapping(value = "/reqmap1")
	public String reqmap1() {
		return "ini reqmap 1 path /api/reqmap1";
	}
	
	@RequestMapping(value = "/reqmap2", params = "param1=val1", method = RequestMethod.GET)
	public String reqmap2() {
		return "ini reqmap 2 path /api/reqmap2";
	}
}
