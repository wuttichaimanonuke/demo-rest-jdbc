package com.gable.cpb.repository.cpb;

import java.util.List;

import com.gable.cpb.entity.cpb.CpbEnvelop;

public interface ICpbEnvelopDAO {

	List<CpbEnvelop> getAllCpbEnvelops() throws Exception;

}
