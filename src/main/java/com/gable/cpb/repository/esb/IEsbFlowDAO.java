package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbFlow;

public interface IEsbFlowDAO {

	List<EsbFlow> getAllesbFlows() throws Exception;

}
