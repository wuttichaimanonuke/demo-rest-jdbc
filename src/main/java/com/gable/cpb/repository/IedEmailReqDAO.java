package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edEmailReq;

public interface IedEmailReqDAO {

	List<edEmailReq> getAlledEmailReqs() throws Exception;

}
