package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbReqRun;

public interface ICpbReqRunDAO {

	List<CpbReqRun> getAllCpbReqRuns() throws Exception;

}
