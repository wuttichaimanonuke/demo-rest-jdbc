package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbShelf;

public interface ICpbShelfDAO {

	List<CpbShelf> getAllCpbShelfs() throws Exception;

}
