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

	// For top page
	@RequestMapping("/")
	public String index(Model m) {

		if (loginSession.isLogined()) {

			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}
		return "index";
	}

	// For terms page
	@RequestMapping("/terms")
	public String terms(Model m) {
		if (loginSession.isLogined()) {

			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}

		return "terms";
	}

	// For contact page
	@RequestMapping("/contact")
	public String contact(Model m) {
		if (loginSession.isLogined()) {

			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());

			m.addAttribute("user", user);
			// m.addAttribute("loginSession", loginSession);
		}

		return "contact";
	}
	
	// For policy page
	@RequestMapping("/policy")
	public String policy() {
		return "policy";
	}
	
	// For senpai detail
	@RequestMapping("senpai/{id}")
	public String senapiDetail(@PathVariable("id") int id, Model m) {
		
		UserSearchDto senpai = userMapper.findById(id);
		
		m.addAttribute("senpai", senpai);
		
		// ログインステータス確認
		String userName = loginSession.getUserName();
		String password = loginSession.getPassword();
		UserSearchDto user;
		if(userName != null && password != null) {
			 user = userMapper.loginByUserNameAndPass(userName, password);
		} else {
			user = null;
		}
		m.addAttribute("user", user);

		return "senpai_detail";
	}
	
	// For senpai search
	@RequestMapping("/search-senpai")
	public String senpai(Model m) {
		
		if (loginSession.isLogined()) {
			UserSearchDto user = userMapper.loginByUserNameAndPass(loginSession.getUserName(), loginSession.getPassword());
			m.addAttribute("user", user);
		}
		m.addAttribute("fromSenpaiSearch", "fromSenpaiSearch");
		
		return "index";
	}

	// For for_students page
	@RequestMapping("/for_students")
	public String forStudent(Model m) {
		
		return "for_students";
	}
	
	@RequestMapping("/for_senpai")
	public String forSenpai(Model m) {
		return "for_senpai";
	}
}