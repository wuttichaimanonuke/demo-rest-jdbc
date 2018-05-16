package com.gable.cpb.repository.ed;

import java.util.List;

import com.gable.cpb.entity.ed.EdBrrowUser;

public interface IEdBrrowUserDAO {

	List<EdBrrowUser> getAllEdBrrowUsers() throws Exception;

}
