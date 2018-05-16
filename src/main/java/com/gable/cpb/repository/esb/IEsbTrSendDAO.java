package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbTrSend;

public interface IEsbTrSendDAO {

	List<EsbTrSend> getAllesbTrSends() throws Exception;

}
