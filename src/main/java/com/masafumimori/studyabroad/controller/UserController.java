package com.masafumimori.studyabroad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.form.UserForm;
import com.masafumimori.studyabroad.model.mapper.MstUserMapper;

@Controller
@RequestMapping("/studyabroad/user")
public class UserController {
	
	@Autowired
	MstUserMapper userMapper;

	@RequestMapping("/signup")
	public String register() {
		return "signup";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		MstUser user = new MstUser(f);
		
		int count = userMapper.insert(user);
		
		return count > 0;
	}
}
