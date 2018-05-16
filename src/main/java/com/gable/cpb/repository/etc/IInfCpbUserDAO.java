package com.gable.cpb.repository.etc;

import java.util.List;

import com.gable.cpb.entity.etc.InfCpbUser;

public interface IInfCpbUserDAO {

	List<InfCpbUser> getAllinfCpbUsers() throws Exception;

}
