package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbIndexWaiting;

public interface IEsbIndexWaitingDAO {

	List<EsbIndexWaiting> getAllesbIndexWaitings() throws Exception;

}
