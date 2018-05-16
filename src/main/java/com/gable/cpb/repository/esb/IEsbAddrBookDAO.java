package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbAddrBook;

public interface IEsbAddrBookDAO {

	List<EsbAddrBook> getAllesbAddrBooks() throws Exception;

}
