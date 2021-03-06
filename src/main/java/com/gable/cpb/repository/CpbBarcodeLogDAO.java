package com.gable.cpb.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbBarcodeLogDAO implements ICpbBarcodeLogDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbBarcodeLogDAO.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${cpb.cmes.schema}")
	private String cmesSchema;
	
}
