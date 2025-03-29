package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Vehical;
import com.tka.service.VehicalService;

@RestController
public class VeicalController {

	@Autowired
	VehicalService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody Vehical v) {
		String msg = service.insertData(v);
		return msg;
	}
}
