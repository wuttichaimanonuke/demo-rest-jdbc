package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.infCpbUser;

public interface IinfCpbUserDAO {

	List<infCpbUser> getAllinfCpbUsers() throws Exception;

}