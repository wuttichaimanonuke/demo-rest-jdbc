package com.gable.cpb.entity.etc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ToadPlanTableRowMapper implements RowMapper<ToadPlanTable> {

	@Override
	public ToadPlanTable mapRow(ResultSet row, int rowNum) throws SQLException {
		ToadPlanTable entity = new ToadPlanTable();
		entity.setStatementId(row.getString("STATEMENT_ID"));
		entity.setPlanId(row.getInt("PLAN_ID"));
		entity.setTimestamp(row.getDate("TIMESTAMP"));
		entity.setRemarks(row.getString("REMARKS"));
		entity.setOperation(row.getString("OPERATION"));
		entity.setOption(row.getString("OPTIONS"));
		entity.setObjectNode(row.getString("OBJECT_NODE"));
		entity.setObjectOwner(row.getString("OBJECT_OWNER"));
		entity.setObjectName(row.getString("OBJECT_NAME"));
		entity.setObjectAlias(row.getString("OBJECT_ALIAS"));
		entity.setObjectInstance(row.getInt("OBJECT_INSTANCE"));
		entity.setObjectType(row.getString("OBJECT_TYPE"));
		entity.setOptimizer(row.getString("OPTIMIZER"));
		entity.setSearchColumns(row.getInt("SEARCH_COLUMNS"));
		entity.setId(row.getInt("ID"));
		entity.setParentId(row.getInt("PARENT_ID"));
		entity.setDepth(row.getInt("DEPTH"));
		entity.setPosition(row.getInt("POSITION"));
		entity.setCost(row.getInt("COST"));
		entity.setCardinality(row.getInt("CARDINALITY"));
		entity.setBytes(row.getLong("BYTES"));
		entity.setOtherTag(row.getString("OTHER_TAG"));
		entity.setPartitionStart(row.getString("PARTITION_START"));
		entity.setPartitionStop(row.getString("PARTITION_STOP"));
		entity.setPartitionId(row.getInt("PARTITION_ID"));
		entity.setOther(row.getLong("OTHER"));
		entity.setDistribution(row.getString("DISTRIBUTION"));
		entity.setCpuCost(row.getLong("CPU_COST"));
		entity.setIoCost(row.getLong("IO_COST"));
		entity.setTempSpace(row.getInt("TEMP_SPACE"));
		entity.setAccessPredicates(row.getString("ACCESS_PREDICATES"));
		entity.setFilterPredicates(row.getString("FILTER_PREDICATES"));
		entity.setProjection(row.getString("PROJECTION"));
		entity.setTime(row.getInt("TIME"));
		entity.setQblockName(row.getString("QBLOCK_NAME"));
		entity.setOtherXml(row.getString("OTHER_XML"));
		return entity;
	}

}
