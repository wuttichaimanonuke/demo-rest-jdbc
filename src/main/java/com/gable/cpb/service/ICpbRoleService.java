package com.gable.cpb.service;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbRole;
import com.gable.cpb.entity.cpb.CpbRoleJoinCpbRoleType;

public interface ICpbRoleService {

	List<CpbRole> getRoleByUserId(Long userId) throws Exception;

	List<CpbRoleJoinCpbRoleType> getAllCpbRoleJoinCpbRoleType() throws Exception;
}
