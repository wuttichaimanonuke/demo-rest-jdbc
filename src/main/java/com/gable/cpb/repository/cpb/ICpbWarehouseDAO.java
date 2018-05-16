package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbWarehouse;

public interface ICpbWarehouseDAO {

	List<CpbWarehouse> getAllCpbWarehouses() throws Exception;

}
