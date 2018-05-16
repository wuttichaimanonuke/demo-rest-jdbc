package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdReqRetrieve;

public interface IEdReqRetrieveDAO {

	List<EdReqRetrieve> getAlledReqRetrieves() throws Exception;

}
