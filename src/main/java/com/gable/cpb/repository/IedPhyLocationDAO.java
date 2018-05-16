package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edPhyLocation;

public interface IedPhyLocationDAO {

	List<edPhyLocation> getAlledPhyLocations() throws Exception;

}
