package com.masafumimori.studyabroad.controller;

import com.google.gson.Gson;
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
	
	@Autowired
	private Gson gson = new Gson();
	
	@RequestMapping("/signup_page")
	public String signupLoad() {
		return "signup";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		MstUser user = new MstUser(f);
		
		int count = userMapper.insert(user);
		
		return count > 0;
	}
	
	@RequestMapping("/login_page")
	public String loginLoad() {
		return "login";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestBody UserForm f) {
		
		String userName = f.getUserName();
		String password = f.getPassword();
		
		MstUser user = userMapper.loginByUserNameAndPass(userName, password);
		
		return gson.toJson(user);
	}
	
	
}
