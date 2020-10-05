package com.masafumimori.studyabroad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.form.SearchForm;
import com.masafumimori.studyabroad.model.mapper.UserSearchMapper;

@Controller
@RequestMapping("/studyabroad/search")
public class UserSearchController {
	
	@Autowired
	UserSearchMapper searchMapper;

	@RequestMapping("/")
	public String searchUser(SearchForm s, Model m) {
		
		List<MstUser> users;
		
		//Need to modify definitions of these variables
		String keywords = s.getKeywords();
		String areas = s.getAreas();
		String nations = s.getNations();
		
		if(keywords == null) {
			users = searchMapper.findByAreaAndNation(areas.split(" "), nations.split(" "));
		} else {
			//Code to search with keywords and areas/nations
			users = null;
		}
		
		m.addAttribute("users", users);
		
		return "search_result";
	}
}
