package com.masafumimori.studyabroad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.form.UserForm;
import com.masafumimori.studyabroad.model.mapper.MstUserMapper;
import com.masafumimori.studyabroad.model.session.LoginSession;

@Controller
@RequestMapping("/studyabroad/user")
public class UserController {

	@Autowired
	MstUserMapper userMapper;

	@Autowired
	LoginSession loginSession;

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

		if(user != null) {
			loginSession.setUserId(user.getId());
			loginSession.setUserName(user.getUserName());
			loginSession.setPassword(user.getPassword());
			loginSession.setLogined(true);
		}

		return gson.toJson(user);
	}

	@RequestMapping("/mypage")
	public String mypage(Model m) {

		String userName = loginSession.getUserName();
		String password = loginSession.getPassword();

		MstUser user = userMapper.loginByUserNameAndPass(userName, password);

		m.addAttribute("user", user);
		//m.addAttribute("loginSession", loginSession);

		return "mypage";
	}

}