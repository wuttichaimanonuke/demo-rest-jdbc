package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbEnvelop;

public interface ICpbEnvelopDAO {

	List<CpbEnvelop> getAllCpbEnvelops() throws Exception;

}
