package com.masafumimori.studyabroad.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.masafumimori.studyabroad.model.domain.MstUser;
import com.masafumimori.studyabroad.model.domain.dto.UserSearchDto;
import com.masafumimori.studyabroad.model.form.UserForm;

@Mapper
public interface MstUserMapper {
	
	// For sign-up
	@Insert("INSERT INTO mst_user (user_name, password, email)" +
			"VALUES (#{userName}, #{password}, #{email})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstUser user);
	
	// For insert into SNS table
	@Insert("INSERT INTO mst_user_sns (user_id, user_name) " +
			"SELECT user.id, user.user_name " +
			"FROM mst_user user " +
			"WHERE user.user_name = #{userName}"
			)
	Integer addSns(@Param("userName") String userName);
	
	
	// For login
	UserSearchDto loginByUserNameAndPass(
			@Param("userName") String userName,
			@Param("password") String password
			);
	
	// For update profile
	@Update("UPDATE mst_user " +
			"SET user_name = #{userName}, " +
			"password = #{password}, " +
			"email = #{email}, " +
			"area = #{area}, " +
			"nation = #{nation}, " +
			"updated_at = now() " +
			"WHERE id = #{id}"
			)
	int updateMstUser(UserForm user);
	
	@Update("UPDATE mst_user_sns " +
			"SET user_name = #{userName}, " +
			"twitter = #{twitter}, " +
			"instagram = #{instagram}, " +
			"facebook = #{facebook}, " +
			"updated_at = now() " +
			"WHERE user_id = #{id}"
			)
	int updateMstUserSns(UserForm user);
	
	
	UserSearchDto findById(int id);
}