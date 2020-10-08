package com.masafumimori.studyabroad.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.domain.dto.UserSearchDto;

@Mapper
public interface MstUserMapper {
	
	// For sign-up
	@Insert("INSERT INTO mst_user (user_name, password, email)" +
			"VALUES (#{userName}, #{password}, #{email})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstUser user);
	
	// For insert into SNS table
	@Insert("INSERT INTO mst_user_sns (user_name)" +
			"VALUES (#{userName}")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(@Param("userName") String userName);
	
	
	// For login
	UserSearchDto loginByUserNameAndPass(
			@Param("userName") String userName,
			@Param("password") String password
			);
}