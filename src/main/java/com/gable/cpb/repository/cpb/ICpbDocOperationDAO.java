package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbDocOperation;

public interface ICpbDocOperationDAO {

	List<CpbDocOperation> getAllCpbDocOperations() throws Exception;

}
