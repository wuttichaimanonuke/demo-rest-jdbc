package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdWaitingDoc;

public interface IEdWaitingDocDAO {

	List<EdWaitingDoc> getAlledWaitingDocs() throws Exception;

}
