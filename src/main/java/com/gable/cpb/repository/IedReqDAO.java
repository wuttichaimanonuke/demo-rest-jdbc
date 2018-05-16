package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edReq;

public interface IedReqDAO {

	List<edReq> getAlledReqs() throws Exception;

}
