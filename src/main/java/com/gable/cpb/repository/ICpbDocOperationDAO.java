package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbDocOperation;

public interface ICpbDocOperationDAO {

	List<CpbDocOperation> getAllCpbDocOperations() throws Exception;

}
