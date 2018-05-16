package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdReq;

public interface IEdReqDAO {

	List<EdReq> getAlledReqs() throws Exception;

}
