package com.masafumimori.studyabroad.controller;

import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.mapper.MstUserMapper;
import com.masafumimori.studyabroad.model.session.LoginSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studyabroad")
public class IndexController {

	@Autowired
	LoginSession loginSession;

	@Autowired
	MstUserMapper userMapper;

	@RequestMapping("/")
	public String index(Model m) {

		if (loginSession.isLogined()) {

			MstUser user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}
		return "index";
	}

	@RequestMapping("/terms")
	public String terms() {
		if (loginSession.isLogined()) {

			MstUser user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}

		return "terms";
	}

}