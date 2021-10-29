package com.jajal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jajal.object.InfoObj;


@RestController
public class DreqParamController {
	
	/**
	 * harus ada parameter yang nanti ditangkap ke variabel name
	 * @param name
	 * @return
	 */
	@RequestMapping("/haloreq1")
	public String helloRequest1(@RequestParam(value = "name") String name) {
		System.out.println("hellorequest1 var : " + name);
		return String.format("hello request 1 %s !", name);
	}
	
	/**
	 * tidak harus ada parameter karena punya default value tpi bisa kalo mau ada yang nanti ditangkap ke variabel name
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/haloreq2", method = RequestMethod.GET)
	public String helloRequest2(@RequestParam(value = "name", defaultValue = "jajal") String name) {
		System.out.println("hellorequest2 var : " + name);
		return String.format("hello request 2 %s !", name);
	}
	
	/**
	 * terima 2 request param
	 * @param name
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/haloreq3", method = RequestMethod.POST)
	public String helloRequest3(@RequestParam(value = "name", defaultValue = "coba") String name, @RequestParam(value = "id") int id) {
		System.out.println("hellorequest3 var : " + name + " - id : " + id);
		return String.format("hello request 3 name : %s, id : %s !", name, id);
	}
	
	/**
	 * request param dengan mapping semua parameter dalam request
	 * @param allparams
	 * @return
	 */
	@RequestMapping(value = "/haloreq4", method = RequestMethod.POST)
	public String helloRequest4(@RequestParam Map<String, String> allparams) {
		
		System.out.println("paramnya : " + allparams.entrySet());
		
		for(String k : allparams.keySet()) {
			System.out.println("key = " + k + " - val = " + allparams.get(k) );
		}
		
		String id = allparams.get("id");
		String nama = allparams.get("name");
		
		System.out.println("id = " + id);
		System.out.println("name = " + nama);
		
		return String.format("hello request 4 all params : %s !!!", allparams.entrySet());
	}
	
	/**
	 * untuk menerima request multi value
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/haloreq5", method = RequestMethod.GET)
	public String helloRequest5(@RequestParam List<String> id) {
		for(String i : id) {
			System.out.println(i);
		}
		return String.format("hello request 5 id : %s ", id);
	}
	
	/**
	 * untuk menerima request object dan akan return json
	 * @param input
	 * @return
	 */
	@RequestMapping(value = "/haloreq6", method = RequestMethod.GET)
	public InfoObj helloRequest6(InfoObj input) {
		System.out.println("ini inputan objnya " + input);
		return input;
	}
	
	/**
	 * untuk menerima request object dan akan return string
	 * @param input
	 * @return
	 */
	@RequestMapping(value = "/haloreq7", method = RequestMethod.GET)
	public String helloRequest7(InfoObj input) {
		System.out.println("ini input obj nya " + input);
		
		return String.format("id : %s, info : %s ", input.getId(), input.getInfo());
	}
	
}
