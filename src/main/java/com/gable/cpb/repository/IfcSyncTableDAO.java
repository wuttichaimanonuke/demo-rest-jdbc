package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.fcSyncTable;

public interface IfcSyncTableDAO {

	List<fcSyncTable> getAllfcSyncTables() throws Exception;

}
