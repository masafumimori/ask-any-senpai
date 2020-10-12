package com.masafumimori.studyabroad.controller;

import com.masafumimori.studyabroad.model.domain.dto.UserSearchDto;
import com.masafumimori.studyabroad.model.mapper.MstUserMapper;
import com.masafumimori.studyabroad.model.session.LoginSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}
		return "index";
	}

	@RequestMapping("/terms")
	public String terms(Model m) {
		if (loginSession.isLogined()) {

			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}

		return "terms";
	}

	@RequestMapping("/contact")
	public String contact(Model m) {
		if (loginSession.isLogined()) {

			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}

		return "contact";
	}
	
	@RequestMapping("/policy")
	public String policy() {
		return "policy";
	}
	
	@RequestMapping("senpai/{id}")
	public String senpaiPage(@PathVariable("id") int id, Model m) {
		
		UserSearchDto senpai = userMapper.findById(id);
		
		m.addAttribute("senpai", senpai);
		
		return "senpai_detail";
	}

}