package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbShelf;

public interface ICpbShelfDAO {

	List<CpbShelf> getAllCpbShelfs() throws Exception;

}
