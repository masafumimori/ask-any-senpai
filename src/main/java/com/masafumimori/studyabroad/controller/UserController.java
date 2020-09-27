package com.masafumimori.studyabroad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studyabroad/user")
public class UserController {

	@RequestMapping("/register")
	public String index() {
		return "register";
	}
}
