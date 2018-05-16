package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbService;

public interface ICpbServiceDAO {

	List<CpbService> getAllCpbServices() throws Exception;

}
