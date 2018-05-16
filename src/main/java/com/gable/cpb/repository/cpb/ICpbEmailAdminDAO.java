package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbEmailAdmin;

public interface ICpbEmailAdminDAO {

	List<CpbEmailAdmin> getAllCpbEmailAdmins() throws Exception;

}
