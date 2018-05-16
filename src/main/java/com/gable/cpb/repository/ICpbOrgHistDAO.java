package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbOrgHist;

public interface ICpbOrgHistDAO {

	List<CpbOrgHist> getAllCpbOrgHists() throws Exception;

}
