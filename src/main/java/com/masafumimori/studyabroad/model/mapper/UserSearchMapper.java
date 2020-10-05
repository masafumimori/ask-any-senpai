package com.masafumimori.studyabroad.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.masafumimori.studyabroad.model.domain.MstUser;

@Mapper
public interface UserSearchMapper {

	List<MstUser> findByAreaAndNation(
			@Param("areas") String[] areas,
			@Param("nations") String[] nations
			);
}
