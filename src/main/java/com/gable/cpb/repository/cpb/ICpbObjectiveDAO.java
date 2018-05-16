package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbObjective;

public interface ICpbObjectiveDAO {

	List<CpbObjective> getAllCpbObjectives() throws Exception;

}
