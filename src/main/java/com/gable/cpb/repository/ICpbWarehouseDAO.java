package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbWarehouse;

public interface ICpbWarehouseDAO {

	List<CpbWarehouse> getAllCpbWarehouses() throws Exception;

}
