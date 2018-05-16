package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdReqWaitingDoc;

public interface IEdReqWaitingDocDAO {

	List<EdReqWaitingDoc> getAlledReqWaitingDocs() throws Exception;

}
