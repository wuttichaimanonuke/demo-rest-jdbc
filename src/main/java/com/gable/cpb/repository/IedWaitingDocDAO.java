package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edWaitingDoc;

public interface IedWaitingDocDAO {

	List<edWaitingDoc> getAlledWaitingDocs() throws Exception;

}
