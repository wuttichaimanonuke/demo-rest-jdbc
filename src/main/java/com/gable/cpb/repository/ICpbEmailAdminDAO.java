package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbEmailAdmin;

public interface ICpbEmailAdminDAO {

	List<CpbEmailAdmin> getAllCpbEmailAdmins() throws Exception;

}
