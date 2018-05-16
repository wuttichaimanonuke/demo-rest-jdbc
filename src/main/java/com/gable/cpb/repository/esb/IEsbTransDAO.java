package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbTrans;

public interface IEsbTransDAO {

	List<EsbTrans> getAllesbTranss() throws Exception;

}
