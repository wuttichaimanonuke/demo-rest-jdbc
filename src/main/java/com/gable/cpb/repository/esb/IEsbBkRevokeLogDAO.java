package com.gable.cpb.repository.esb;

import java.util.List;

import com.gable.cpb.entity.esb.EsbBkRevokeLog;

public interface IEsbBkRevokeLogDAO {

	List<EsbBkRevokeLog> getAllesbBkRevokeLogs() throws Exception;

}
