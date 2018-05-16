package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edReqWaitingDoc;

public interface IedReqWaitingDocDAO {

	List<edReqWaitingDoc> getAlledReqWaitingDocs() throws Exception;

}
