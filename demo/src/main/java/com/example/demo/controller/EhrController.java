package com.example.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ehr")
public class EhrController{
	@ResponseBody
	@RequestMapping(method = GET, produces = "application/json")
	public String ehr() {
		System.out.println("Recording EHR in the system");
		return "{\"respMgs\" : \"EHR successfully recorded\"}";
	}
}