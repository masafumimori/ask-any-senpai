package com.masafumimori.studyabroad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studyabroad/user")
public class UserController {

	@RequestMapping("/signup")
	public String register() {
		return "signup";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
