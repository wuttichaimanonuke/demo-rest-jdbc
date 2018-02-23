package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbUser;

public interface ICpbUserDAO {

	List<CpbUser> getAllCpbUsers() throws Exception;
	CpbUser getCpbUserByUserId(long userId) throws Exception;
	Boolean userIdExists(long userId) throws Exception;
	Boolean userLoginExists(String userLogin) throws Exception;
	Boolean fullNameExists(String fullName) throws Exception;
	Boolean eMailExists(String eMail) throws Exception;
}
