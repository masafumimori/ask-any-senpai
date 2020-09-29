package com.masafumimori.studyabroad.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.masafumimori.studyabroad.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
	
	// For sign-up
	@Insert("INSERT INTO mst_user (user_name, password, full_name, email)" +
			"VALUES (#{userName}, #{password}, #{fullName}, #{email})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstUser user);

	//For login
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser loginByUserNameAndPass(
			@Param("userName") String userName,
			@Param("password") String password
			);
	
}
