package com.Demoproject.demoProject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {
	@RequestMapping("/hii")
	public String getMessage() {
		return "hello";
	}
	

}
