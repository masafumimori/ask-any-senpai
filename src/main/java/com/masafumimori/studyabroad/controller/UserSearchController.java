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
		String[] areas;
		String[] nations;
		
		//Need to modify below
		String keywords = s.getKeywords();

		if(s.getAreas() != null) {
			areas = s.getAreas().split(",");
		} else {
			areas = null;
		}
		
		if(s.getNations() != null) {
			nations = s.getNations().split(",");
		} else {
			nations = null;
		}
		
		if(keywords == null) {
			users = searchMapper.findByAreaAndNation(areas, nations);
		} else {
			//Code to search with keywords and areas/nations
			users = null;
		}
		
		m.addAttribute("users", users);
		
		return "search_result";
	}
}
