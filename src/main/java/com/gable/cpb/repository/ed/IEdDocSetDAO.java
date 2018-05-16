package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdDocSet;

public interface IEdDocSetDAO {

	List<EdDocSet> getAlledDocSets() throws Exception;

}
