package com.masafumimori.studyabroad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masafumimori.studyabroad.model.domain.dto.UserSearchDto;
import com.masafumimori.studyabroad.model.form.SearchForm;
import com.masafumimori.studyabroad.model.mapper.MstUserMapper;
import com.masafumimori.studyabroad.model.mapper.UserSearchMapper;
import com.masafumimori.studyabroad.model.session.LoginSession;

@Controller
@RequestMapping("/studyabroad/search")
public class UserSearchController {

	@Autowired
	UserSearchMapper searchMapper;
	
	@Autowired
	MstUserMapper userMapper;

	@Autowired
	LoginSession loginSession;

	@RequestMapping("/")
	public String searchUser(SearchForm s, Model m) {

		List<UserSearchDto> matchedUsers;
		int matchedUserCount = 0;
		String[] areas;
		String[] nations;
		String[] purposes;

		// Need to modify below
		String keywords = s.getKeywords();

		if (s.getAreas() != null) {
			areas = s.getAreas().split(",");
		} else {
			areas = null;
		}

		if (s.getNations() != null) {
			nations = s.getNations().split(",");
		} else {
			nations = null;
		}
		
		if(s.getPurposes() != null) {
			purposes = s.getPurposes().split(",");
		} else {
			purposes = null;
		}

		if (keywords == null) {
			matchedUsers = searchMapper.findMatchedUser(areas, nations, purposes);
			matchedUserCount = matchedUsers.size();
		} else {
			// Code to search with keywords and areas/nations
			matchedUsers = null;
		}
		
		String userName = loginSession.getUserName();
		String password = loginSession.getPassword();

		UserSearchDto user = userMapper.loginByUserNameAndPass(userName, password);

		m.addAttribute("user", user);

		m.addAttribute("matchedUsers", matchedUsers);
		m.addAttribute("matchedUserCount", matchedUserCount);

		return "index";
	}
}
