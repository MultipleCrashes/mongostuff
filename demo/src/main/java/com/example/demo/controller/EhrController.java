package com.example.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ehr")
public class EhrController{
	@ResponseBody
	@RequestMapping(method = POST, produces = "application/json")
	public String ehr(HttpRequest request) {
		System.out.println("Request object for the EHR API is "+ request);
		
		System.out.println("Recording EHR in the system");
		return "{\"respMgs\" : \"EHR successfully recorded\"}";
		
	}
}