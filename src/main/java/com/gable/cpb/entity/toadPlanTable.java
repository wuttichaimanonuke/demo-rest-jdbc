package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class toadPlanTable {

	private String statementId;
	private Integer planId;
	private Date timestamp;
	private String remarks;
	private String operation;
	private String option;
	private String objectNode;
	private String objectOwner;
	private String objectName;
	private String objectAlias;
	private Integer objectInstance;
	private String objectType;
	private String optimizer;
	private Integer searchColumns;
	private Integer id;
	private Integer parentId;
	private Integer depth;
	private Integer position;
	private Integer cost;
	private Integer cardinality;
	private Long bytes;
	private String otherTag;
	private String partitionStart;
	private String partitionStop;
	private Integer partitionId;
	private Long other;
	private String distribution;
	private Long cpuCost;
	private Long ioCost;
	private Integer tempSpace;
	private String accessPredicates;
	private String filterPredicates;
	private String projection;
	private Integer time;
	private String qblockName;
	private String otherXml;

	@JsonIgnore

	public toadPlanTable() {
		super();
	}

	public toadPlanTable(String statementId, Integer planId, Date timestamp, String remarks, String operation, String option, String objectNode, String objectOwner, String objectName, String objectAlias, Integer objectInstance, String objectType, String optimizer, Integer searchColumns, Integer id, Integer parentId, Integer depth, Integer position, Integer cost, Integer cardinality, Long bytes, String otherTag, String partitionStart, String partitionStop, Integer partitionId, Long other, String distribution, Long cpuCost, Long ioCost, Integer tempSpace, String accessPredicates, String filterPredicates, String projection, Integer time, String qblockName, String otherXml) {
		super();
		this.statementId = statementId;
		this.planId = planId;
		this.timestamp = timestamp;
		this.remarks = remarks;
		this.operation = operation;
		this.option = option;
		this.objectNode = objectNode;
		this.objectOwner = objectOwner;
		this.objectName = objectName;
		this.objectAlias = objectAlias;
		this.objectInstance = objectInstance;
		this.objectType = objectType;
		this.optimizer = optimizer;
		this.searchColumns = searchColumns;
		this.id = id;
		this.parentId = parentId;
		this.depth = depth;
		this.position = position;
		this.cost = cost;
		this.cardinality = cardinality;
		this.bytes = bytes;
		this.otherTag = otherTag;
		this.partitionStart = partitionStart;
		this.partitionStop = partitionStop;
		this.partitionId = partitionId;
		this.other = other;
		this.distribution = distribution;
		this.cpuCost = cpuCost;
		this.ioCost = ioCost;
		this.tempSpace = tempSpace;
		this.accessPredicates = accessPredicates;
		this.filterPredicates = filterPredicates;
		this.projection = projection;
		this.time = time;
		this.qblockName = qblockName;
		this.otherXml = otherXml;
	}

	public String getStatementId() {
		return statementId;
	}

	public Integer getPlanId() {
		return planId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getOperation() {
		return operation;
	}

	public String getOption() {
		return option;
	}

	public String getObjectNode() {
		return objectNode;
	}

	public String getObjectOwner() {
		return objectOwner;
	}

	public String getObjectName() {
		return objectName;
	}

	public String getObjectAlias() {
		return objectAlias;
	}

	public Integer getObjectInstance() {
		return objectInstance;
	}

	public String getObjectType() {
		return objectType;
	}

	public String getOptimizer() {
		return optimizer;
	}

	public Integer getSearchColumns() {
		return searchColumns;
	}

	public Integer getId() {
		return id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public Integer getDepth() {
		return depth;
	}

	public Integer getPosition() {
		return position;
	}

	public Integer getCost() {
		return cost;
	}

	public Integer getCardinality() {
		return cardinality;
	}

	public Long getBytes() {
		return bytes;
	}

	public String getOtherTag() {
		return otherTag;
	}

	public String getPartitionStart() {
		return partitionStart;
	}

	public String getPartitionStop() {
		return partitionStop;
	}

	public Integer getPartitionId() {
		return partitionId;
	}

	public Long getOther() {
		return other;
	}

	public String getDistribution() {
		return distribution;
	}

	public Long getCpuCost() {
		return cpuCost;
	}

	public Long getIoCost() {
		return ioCost;
	}

	public Integer getTempSpace() {
		return tempSpace;
	}

	public String getAccessPredicates() {
		return accessPredicates;
	}

	public String getFilterPredicates() {
		return filterPredicates;
	}

	public String getProjection() {
		return projection;
	}

	public Integer getTime() {
		return time;
	}

	public String getQblockName() {
		return qblockName;
	}

	public String getOtherXml() {
		return otherXml;
	}

	public void setStatementId(String statementId) {
		this.statementId = statementId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public void setObjectNode(String objectNode) {
		this.objectNode = objectNode;
	}

	public void setObjectOwner(String objectOwner) {
		this.objectOwner = objectOwner;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public void setObjectAlias(String objectAlias) {
		this.objectAlias = objectAlias;
	}

	public void setObjectInstance(Integer objectInstance) {
		this.objectInstance = objectInstance;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public void setOptimizer(String optimizer) {
		this.optimizer = optimizer;
	}

	public void setSearchColumns(Integer searchColumns) {
		this.searchColumns = searchColumns;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public void setCardinality(Integer cardinality) {
		this.cardinality = cardinality;
	}

	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	public void setOtherTag(String otherTag) {
		this.otherTag = otherTag;
	}

	public void setPartitionStart(String partitionStart) {
		this.partitionStart = partitionStart;
	}

	public void setPartitionStop(String partitionStop) {
		this.partitionStop = partitionStop;
	}

	public void setPartitionId(Integer partitionId) {
		this.partitionId = partitionId;
	}

	public void setOther(Long other) {
		this.other = other;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public void setCpuCost(Long cpuCost) {
		this.cpuCost = cpuCost;
	}

	public void setIoCost(Long ioCost) {
		this.ioCost = ioCost;
	}

	public void setTempSpace(Integer tempSpace) {
		this.tempSpace = tempSpace;
	}

	public void setAccessPredicates(String accessPredicates) {
		this.accessPredicates = accessPredicates;
	}

	public void setFilterPredicates(String filterPredicates) {
		this.filterPredicates = filterPredicates;
	}

	public void setProjection(String projection) {
		this.projection = projection;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public void setQblockName(String qblockName) {
		this.qblockName = qblockName;
	}

	public void setOtherXml(String otherXml) {
		this.otherXml = otherXml;
	}


	@Override
	public String toString() {
		return "toadPlanTable [statementId = " + statementId + ", planId = " + planId + ", timestamp = " + timestamp + ", remarks = " + remarks + ", operation = " + operation + ", option = " + option + ", objectNode = " + objectNode + ", objectOwner = " + objectOwner + ", objectName = " + objectName + ", objectAlias = " + objectAlias + ", objectInstance = " + objectInstance + ", objectType = " + objectType + ", optimizer = " + optimizer + ", searchColumns = " + searchColumns + ", id = " + id + ", parentId = " + parentId + ", depth = " + depth + ", position = " + position + ", cost = " + cost + ", cardinality = " + cardinality + ", bytes = " + bytes + ", otherTag = " + otherTag + ", partitionStart = " + partitionStart + ", partitionStop = " + partitionStop + ", partitionId = " + partitionId + ", other = " + other + ", distribution = " + distribution + ", cpuCost = " + cpuCost + ", ioCost = " + ioCost + ", tempSpace = " + tempSpace + ", accessPredicates = " + accessPredicates + ", filterPredicates = " + filterPredicates + ", projection = " + projection + ", time = " + time + ", qblockName = " + qblockName + ", otherXml = " + otherXml + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessPredicates == null) ? 0 : accessPredicates.hashCode());
		result = prime * result + ((bytes == null) ? 0 : bytes.hashCode());
		result = prime * result + ((cardinality == null) ? 0 : cardinality.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((cpuCost == null) ? 0 : cpuCost.hashCode());
		result = prime * result + ((depth == null) ? 0 : depth.hashCode());
		result = prime * result + ((distribution == null) ? 0 : distribution.hashCode());
		result = prime * result + ((filterPredicates == null) ? 0 : filterPredicates.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ioCost == null) ? 0 : ioCost.hashCode());
		result = prime * result + ((objectAlias == null) ? 0 : objectAlias.hashCode());
		result = prime * result + ((objectInstance == null) ? 0 : objectInstance.hashCode());
		result = prime * result + ((objectName == null) ? 0 : objectName.hashCode());
		result = prime * result + ((objectNode == null) ? 0 : objectNode.hashCode());
		result = prime * result + ((objectOwner == null) ? 0 : objectOwner.hashCode());
		result = prime * result + ((objectType == null) ? 0 : objectType.hashCode());
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		result = prime * result + ((optimizer == null) ? 0 : optimizer.hashCode());
		result = prime * result + ((option == null) ? 0 : option.hashCode());
		result = prime * result + ((other == null) ? 0 : other.hashCode());
		result = prime * result + ((otherTag == null) ? 0 : otherTag.hashCode());
		result = prime * result + ((otherXml == null) ? 0 : otherXml.hashCode());
		result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result + ((partitionId == null) ? 0 : partitionId.hashCode());
		result = prime * result + ((partitionStart == null) ? 0 : partitionStart.hashCode());
		result = prime * result + ((partitionStop == null) ? 0 : partitionStop.hashCode());
		result = prime * result + ((planId == null) ? 0 : planId.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((projection == null) ? 0 : projection.hashCode());
		result = prime * result + ((qblockName == null) ? 0 : qblockName.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((searchColumns == null) ? 0 : searchColumns.hashCode());
		result = prime * result + ((statementId == null) ? 0 : statementId.hashCode());
		result = prime * result + ((tempSpace == null) ? 0 : tempSpace.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		toadPlanTable other = (toadPlanTable) obj;
		if (accessPredicates == null) {
			if (other.accessPredicates != null)
				return false;
		} else if (!accessPredicates.equals(other.accessPredicates))
			return false;
		if (bytes == null) {
			if (other.bytes != null)
				return false;
		} else if (!bytes.equals(other.bytes))
			return false;
		if (cardinality == null) {
			if (other.cardinality != null)
				return false;
		} else if (!cardinality.equals(other.cardinality))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (cpuCost == null) {
			if (other.cpuCost != null)
				return false;
		} else if (!cpuCost.equals(other.cpuCost))
			return false;
		if (depth == null) {
			if (other.depth != null)
				return false;
		} else if (!depth.equals(other.depth))
			return false;
		if (distribution == null) {
			if (other.distribution != null)
				return false;
		} else if (!distribution.equals(other.distribution))
			return false;
		if (filterPredicates == null) {
			if (other.filterPredicates != null)
				return false;
		} else if (!filterPredicates.equals(other.filterPredicates))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ioCost == null) {
			if (other.ioCost != null)
				return false;
		} else if (!ioCost.equals(other.ioCost))
			return false;
		if (objectAlias == null) {
			if (other.objectAlias != null)
				return false;
		} else if (!objectAlias.equals(other.objectAlias))
			return false;
		if (objectInstance == null) {
			if (other.objectInstance != null)
				return false;
		} else if (!objectInstance.equals(other.objectInstance))
			return false;
		if (objectName == null) {
			if (other.objectName != null)
				return false;
		} else if (!objectName.equals(other.objectName))
			return false;
		if (objectNode == null) {
			if (other.objectNode != null)
				return false;
		} else if (!objectNode.equals(other.objectNode))
			return false;
		if (objectOwner == null) {
			if (other.objectOwner != null)
				return false;
		} else if (!objectOwner.equals(other.objectOwner))
			return false;
		if (objectType == null) {
			if (other.objectType != null)
				return false;
		} else if (!objectType.equals(other.objectType))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (optimizer == null) {
			if (other.optimizer != null)
				return false;
		} else if (!optimizer.equals(other.optimizer))
			return false;
		if (option == null) {
			if (other.option != null)
				return false;
		} else if (!option.equals(other.option))
			return false;
		if (this.other == null) {
			if (other.other != null)
				return false;
		} else if (!this.other.equals(other.other))
			return false;
		if (otherTag == null) {
			if (other.otherTag != null)
				return false;
		} else if (!otherTag.equals(other.otherTag))
			return false;
		if (otherXml == null) {
			if (other.otherXml != null)
				return false;
		} else if (!otherXml.equals(other.otherXml))
			return false;
		if (parentId == null) {
			if (other.parentId != null)
				return false;
		} else if (!parentId.equals(other.parentId))
			return false;
		if (partitionId == null) {
			if (other.partitionId != null)
				return false;
		} else if (!partitionId.equals(other.partitionId))
			return false;
		if (partitionStart == null) {
			if (other.partitionStart != null)
				return false;
		} else if (!partitionStart.equals(other.partitionStart))
			return false;
		if (partitionStop == null) {
			if (other.partitionStop != null)
				return false;
		} else if (!partitionStop.equals(other.partitionStop))
			return false;
		if (planId == null) {
			if (other.planId != null)
				return false;
		} else if (!planId.equals(other.planId))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (projection == null) {
			if (other.projection != null)
				return false;
		} else if (!projection.equals(other.projection))
			return false;
		if (qblockName == null) {
			if (other.qblockName != null)
				return false;
		} else if (!qblockName.equals(other.qblockName))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (searchColumns == null) {
			if (other.searchColumns != null)
				return false;
		} else if (!searchColumns.equals(other.searchColumns))
			return false;
		if (statementId == null) {
			if (other.statementId != null)
				return false;
		} else if (!statementId.equals(other.statementId))
			return false;
		if (tempSpace == null) {
			if (other.tempSpace != null)
				return false;
		} else if (!tempSpace.equals(other.tempSpace))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

}