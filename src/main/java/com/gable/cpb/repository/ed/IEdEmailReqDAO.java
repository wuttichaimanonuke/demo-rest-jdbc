package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdEmailReq;

public interface IEdEmailReqDAO {

	List<EdEmailReq> getAlledEmailReqs() throws Exception;

}
