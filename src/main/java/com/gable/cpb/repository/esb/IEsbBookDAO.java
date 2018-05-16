package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbBook;

public interface IEsbBookDAO {

	List<EsbBook> getAllesbBooks() throws Exception;

}
