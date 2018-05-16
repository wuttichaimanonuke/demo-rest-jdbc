package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdPhyLocation;

public interface IEdPhyLocationDAO {

	List<EdPhyLocation> getAlledPhyLocations() throws Exception;

}
