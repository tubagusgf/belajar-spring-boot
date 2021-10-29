package com.jajal.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jajal.object.InfoObj;

@RestController
public class FresEntityController {
	
	/**
	 * response entity dengan body string dan httpstatus ok
	 * @return
	 */
	@RequestMapping(value = "/resen1", method = RequestMethod.GET)
	public ResponseEntity<String> resen1() {
		
		return new ResponseEntity<String>("ini dari resentity 1", HttpStatus.OK);
		
	}
	
	/**
	 * response entity dengan body string dan httpstatus bad request
	 * @return
	 */
	@RequestMapping(value = "/resen2", method = RequestMethod.GET)
	public ResponseEntity<String> resen2() {
		
		return new ResponseEntity<String>("ini dari resentity 2", HttpStatus.BAD_REQUEST);
		
	}
	
	/**
	 * ini res entity menggunakan header
	 * @return
	 */
	@RequestMapping(value = "/resen3", method = RequestMethod.GET)
	public ResponseEntity<String> resen3() {
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("headercoba", "isiheader");
		
		return new ResponseEntity<String>("ini dari resentity 3", headers, HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * response entity dengan menggunakan builder
	 * @return
	 */
	@RequestMapping(value = "/resen4", method = RequestMethod.GET)
	public ResponseEntity<String> resen4() {
				
		return ResponseEntity.ok("resentity 4 ini oke dari builder");
	} 
	
	/**
	 * response entity dengan tipe data wild card, dengan memakai status, header, body 
	 * @return
	 */
	@RequestMapping(value = "/resen5", method = RequestMethod.GET)
	public ResponseEntity<?> resen5() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("headercoba", "headerisi");
		
		return ResponseEntity.ok().headers(headers).body("ini dari resen5 yaa ...");
	} 
	
	/**
	 * response entity dengan tipe data wild card, dengan memakai status, body 
	 * @return
	 */
	@RequestMapping(value = "/resen6", method = RequestMethod.GET)
	public ResponseEntity<?> resen6() {
		
		
		return ResponseEntity.badRequest().body("ini dari resen6 yaa ...");
	} 
	
	/**
	 * response entity dengan tipe data wild card, dengan memakai status, body 
	 * @return
	 */
	@RequestMapping(value = "/resen7", method = RequestMethod.GET)
	public ResponseEntity<?> resen7() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("headercoba7", "headerisi7");
		
		return ResponseEntity.status(200).headers(headers).body("ini dari resen7");
	} 
	
	/**
	 * response entity dengan tipe data wild card, dengan memakai status, body 
	 * @return
	 */
	@RequestMapping(value = "/resen8", method = RequestMethod.GET)
	public ResponseEntity<?> resen8() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("headercoba8", "headerisi8");
		
		return ResponseEntity.status(400).headers(headers).body("ini dari resen8");
	} 
	
	/**
	 * response entity dengan tipe data wild card, dengan memakai status, body 
	 * @return
	 */
	@RequestMapping(value = "/resen9", method = RequestMethod.GET)
	public ResponseEntity<?> resen9() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("headercoba9", "headerisi9");
		
		InfoObj a = new InfoObj(2, "Budi");
		
		return ResponseEntity.status(400).headers(headers).body(a);
	} 
}
