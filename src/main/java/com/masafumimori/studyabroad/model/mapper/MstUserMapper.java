package com.masafumimori.studyabroad.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.masafumimori.studyabroad.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
	
	@Insert("INSERT INTO mst_user (user_name, password, full_name, email)" +
			"VALUES (#{userName}, #{password}, #{fullName}, #{email})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstUser user);

}
