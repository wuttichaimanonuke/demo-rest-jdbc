package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbObjective;

public interface ICpbObjectiveDAO {

	List<CpbObjective> getAllCpbObjectives() throws Exception;

}
