package com.gable.cpb.service;

import java.util.List;

import com.gable.cpb.entity.CpbRole;
import com.gable.cpb.entity.CpbRoleJoinCpbRoleType;

public interface ICpbRoleService {

	List<CpbRole> getRoleByUserId(Long userId) throws Exception;

	List<CpbRoleJoinCpbRoleType> getAllCpbRoleJoinCpbRoleType() throws Exception;
}
