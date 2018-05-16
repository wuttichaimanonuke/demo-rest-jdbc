package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbObjectiveType;

public interface ICpbObjectiveTypeDAO {

	List<CpbObjectiveType> getAllCpbObjectiveTypes() throws Exception;

}
