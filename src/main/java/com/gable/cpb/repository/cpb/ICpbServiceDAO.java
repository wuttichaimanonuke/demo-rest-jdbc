package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbService;

public interface ICpbServiceDAO {

	List<CpbService> getAllCpbServices() throws Exception;

}
