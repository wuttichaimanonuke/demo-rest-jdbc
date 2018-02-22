package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbRole;
import com.gable.cpb.entity.CpbRoleJoinCpbRoleType;

public interface ICpbRoleDAO {

	List<CpbRole> getRoleByUserId(Long userId) throws Exception;

	List<CpbRoleJoinCpbRoleType> getAllCpbRoleJoinCpbRoleType() throws Exception;
}
