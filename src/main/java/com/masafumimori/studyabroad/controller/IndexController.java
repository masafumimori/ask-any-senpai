package com.masafumimori.studyabroad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studyabroad")
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
}

