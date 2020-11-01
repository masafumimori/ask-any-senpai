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
		String[] keywords;
		String[] areas;
		String[] nations;
		String[] purposes;

		keywords = s.getKeywords() != "" ?
				 s.getKeywords().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim().split(" "):
				null;

		areas = s.getAreas() != null ?
			s.getAreas().split(",") :
			null;

		nations = s.getNations() != null ?
				s.getNations().split(",") :
				null;
		
		purposes = s.getPurposes() != null ?
				s.getPurposes().split(",") :
				null;

		if (keywords != null) {
			matchedUsers = searchMapper.findUserByKeywords(keywords);
			matchedUserCount = matchedUsers.size();
		} else {
			matchedUsers = searchMapper.findMatchedUser(areas, nations, purposes);
			matchedUserCount = matchedUsers.size();
		}
		
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

		m.addAttribute("matchedUsers", matchedUsers);
		m.addAttribute("matchedUserCount", matchedUserCount);

		return "index";
	}
}
