package com.gable.cpb.repository;

import java.util.List;

import com.gable.cpb.entity.CpbOrgChangeNameHist;

public interface ICpbOrgChangeNameHistDAO {

	List<CpbOrgChangeNameHist> getAllCpbOrgChangeNameHists() throws Exception;

}
