package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdSavedSearch;

public interface IEdSavedSearchDAO {

	List<EdSavedSearch> getAlledSavedSearchs() throws Exception;

}
