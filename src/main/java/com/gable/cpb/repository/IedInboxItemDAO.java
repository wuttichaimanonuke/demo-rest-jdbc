package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.edInboxItem;

public interface IedInboxItemDAO {

	List<edInboxItem> getAlledInboxItems() throws Exception;

}
