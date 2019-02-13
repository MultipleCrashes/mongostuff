package com.example.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.net.UnknownHostException;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.db.*;

@Controller
@RequestMapping("/ehr")
public class EhrController{
	@ResponseBody
	@RequestMapping(method = POST, produces = "application/json")
	public String ehr() {
		
		System.out.println("Recording EHR in the system");
		
		// Persist record in DB
		Connector obj;
		try {
			obj = new Connector("localhost", 27017, "defaultDb", "newcollection");
			obj.iterateCollection();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "{\"respMgs\" : \"EHR successfully recorded\"}";
		
	}
}