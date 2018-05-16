package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbConfDocName;

public interface ICpbConfDocNameDAO {

	List<CpbConfDocName> getAllCpbConfDocNames() throws Exception;

}
