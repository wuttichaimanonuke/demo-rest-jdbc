package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbIndexWaiting;

public interface ICpbIndexWaitingDAO {

	List<CpbIndexWaiting> getAllCpbIndexWaitings() throws Exception;

}
