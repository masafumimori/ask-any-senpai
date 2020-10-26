package com.masafumimori.studyabroad.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.masafumimori.studyabroad.model.domain.dto.UserSearchDto;

@Mapper
public interface UserSearchMapper {

	public List<UserSearchDto> findMatchedUser(
			@Param("areas") String[] areas,
			@Param("nations") String[] nations,
			@Param("purposes") String[] purposes
			);
}
