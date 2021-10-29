package com.jajal.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreqMap1Controller {
	
	@RequestMapping("/reqmap1")
	public String reqmap1() {
		return "ini reqmap1";
	}
	
	/**
	 * req mapping hanya boleh pake method GET 
	 * @return
	 */
	@RequestMapping(value = "/reqmap2", method = RequestMethod.GET )
	public String reqmap2() {
		return "ini reqmap2 hanya pake GET";
	}
	
	/**
	 * req mapping bole pake method GET dan POST
	 * @return
	 */
	@RequestMapping(value = "/reqmap3", method = {RequestMethod.GET, RequestMethod.POST})
	public String reqmap3() {
		return "ini reqmap3, bisa pake GET dan POST";
	}
	
	/**
	 * ini pake getmapping
	 * @return
	 */
	@GetMapping(value = "/reqmap4")
	public String reqmap4() {
		return "ini reqmap4 GET";
	}
	
	/**
	 * ini pake postmapping
	 * @return
	 */
	@PostMapping("/reqmap5")
	public String reqmap5() {
		return "ini reqmap5 POST";
	}
	
	/**
	 * request mapping GET dengan opsional path
	 * @return
	 */
	@GetMapping(value = {"/reqmap6", "/reqmap6-opsional"})
	public String reqmap6() {
		return "ini reqmap6";
	}
	
	/**
	 * memakai produce yaitu response akan menghasilkan sesuai apa yang di produce
	 * @return
	 */
	@GetMapping(value = "/reqmap7", produces = "application/json")
	public String reqmap7() {
		return "ini reqmap7";
	}
	
	/**
	 * request harus memakai header Content-type
	 * @return
	 */
	@RequestMapping(value = "/reqmap8", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String reqmap8() {
		return "ini reqmap8";
	}
	
	/** 
	 * harus memakai header yang ditentukan
	 * @return
	 */
	@RequestMapping(value = "/reqmap9", headers = "key1=val1")
	public String reqmap9() {
		return "ini reqmap9";
	}
	
	/**
	 * harus memakai beberapa header yang ditentukan
	 * @return
	 */
	@RequestMapping(value = "/reqmap10", headers = {"key1=val1", "key2=val2"})
	public String reqmap10() {
		return "ini reqmap10";
	}
	
	/**
	 * request ini harus mempunyai 1 params yang ditentukan
	 * @return
	 */
	@RequestMapping(value = "/reqmap11", method = RequestMethod.GET, params = "param1=val1")
	public String reqmap11() {
		return "ini reqmap11";
	}
	
	/**
	 * request ini harus mempunyai beberapa params yang ditentukan
	 * @return
	 */
	@RequestMapping(value = "/reqmap12", method = RequestMethod.GET, params = {"param1=val1", "param2=val2"})
	public String reqmap12() {
		return "ini reqmap12";
	}
}
