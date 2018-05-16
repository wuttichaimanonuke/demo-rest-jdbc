package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbBkSecret;

public interface IEsbBkSecretDAO {

	List<EsbBkSecret> getAllesbBkSecrets() throws Exception;

}
