package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdInboxItem;

public interface IEdInboxItemDAO {

	List<EdInboxItem> getAlledInboxItems() throws Exception;

}
