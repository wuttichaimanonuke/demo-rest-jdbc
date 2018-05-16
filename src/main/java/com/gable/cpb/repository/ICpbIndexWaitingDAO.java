package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbIndexWaiting;

public interface ICpbIndexWaitingDAO {

	List<CpbIndexWaiting> getAllCpbIndexWaitings() throws Exception;

}
