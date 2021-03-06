package com.masafumimori.studyabroad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.domain.dto.UserSearchDto;
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
		count += userMapper.addSns(f.getUserName());

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

		UserSearchDto user = userMapper.loginByUserNameAndPass(userName, password);

		if(user != null) {
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

		UserSearchDto user = userMapper.loginByUserNameAndPass(userName, password);

		m.addAttribute("user", user);
		//m.addAttribute("loginSession", loginSession);

		return "mypage";
	}
	
	@RequestMapping("/mypage_edit")
	public String mypageEdit(Model m) {
		
		String userName = loginSession.getUserName();
		String password = loginSession.getPassword();

		UserSearchDto user = userMapper.loginByUserNameAndPass(userName, password);

		m.addAttribute("user", user);

		return "mypage_edit";
	}
	
	@RequestMapping("/update")
	public String updateUser(@RequestBody UserForm f, Model m) {
		
		int count = userMapper.updateMstUser(f);
		count += userMapper.updateMstUserSns(f);
		
		if(count > 0) {
			UserSearchDto user = userMapper.loginByUserNameAndPass(f.getUserName(), f.getPassword());
			
			m.addAttribute("user", user);
		}
		
		return "mypage";
	}

	@RequestMapping("/logout")
	@ResponseBody
	public String logout(Model m) {

		loginSession.setUserId(0);
		loginSession.setUserName(null);
		loginSession.setPassword(null);
		loginSession.setLogined(false);

		m.addAttribute("user", null);

		return "logout";
	}
}