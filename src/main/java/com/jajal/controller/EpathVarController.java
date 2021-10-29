package com.jajal.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpathVarController {

	/**
	 * 1 path variable
	 * @param nama
	 * @return
	 */
	@RequestMapping(value = "/pathvar/{name}", method = RequestMethod.GET)
	public String pathVar1(@PathVariable("name") String nama) {
		
		System.out.println("path variabelnya adalah " + nama);
		
		return String.format("path var-nya adalah %s", nama);
	}
	
	/**
	 * lebih dari 1 path variable
	 * @param nama
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/pathvar/{name}/{id}", method = RequestMethod.GET)
	public String pathVar2(@PathVariable("name") String nama, @PathVariable("id") int id) {
		System.out.println("id varnya adalah : " + id);
		System.out.println("nama varnya adalah : " + nama);
		
		return String.format("path var 2 param id : %s dan param nama : %s", id, nama);
	}
	
	/**
	 * path variable dengan mapping semua variable
	 * @param pathvarmap
	 * @return
	 */
	@RequestMapping(value = "/pathvarmap/{name}/{id}", method = RequestMethod.GET)
	public String pathVar3(@PathVariable Map<String, String> pathvarmap) {
		
		System.out.println("path variabelnya : " + pathvarmap.entrySet());
		
		for(String k : pathvarmap.keySet()) {
			System.out.println("key = " + k + " - val = " + pathvarmap.get(k));
		}
		
		System.out.println("name : " + pathvarmap.get("name"));
		System.out.println("id : " + pathvarmap.get("id"));
		
		return String.format("path var 3 dengan semua param bentuk map => %s", pathvarmap.entrySet());
	}
	
	/**
	 * path var dengan opsional atau array pada req mapping
	 * @param nama
	 * @return
	 */
	@RequestMapping(value = {"/pathvar1/{name}", "/pathvar2/{name}"}, method = RequestMethod.GET)
	public String pathVar4(@PathVariable("name") String nama) {
		System.out.println("path dengan opsional request mapping, var nya adalah : " + nama);
		
		return String.format("path opsi reqmap var %s", nama);
	}
	
	/**
	 * path var tapi tidak wajib
	 * @param nama
	 * @return
	 */
	@RequestMapping(value = {"/pathvar5/{name}", "/pathvar5"})
	public String pathVar5(@PathVariable(value = "name", required = false) String nama) {
		
		if (nama == null) {
			return "gak ada namanya nich";
		} else {
			return String.format("path opsi ada namanya nich. namanya adalah : %s", nama);
		}
	}
	
}
