package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edSavedSearch;

public interface IedSavedSearchDAO {

	List<edSavedSearch> getAlledSavedSearchs() throws Exception;

}
