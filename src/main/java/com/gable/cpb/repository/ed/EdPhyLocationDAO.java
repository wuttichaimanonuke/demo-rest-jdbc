package com.gable.cpb.repository.ed;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gable.cpb.entity.ed.EdPhyLocation;
import com.gable.cpb.entity.ed.EdPhyLocationRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdPhyLocationDAO implements IEdPhyLocationDAO {

	private static final Logger log = LoggerFactory.getLogger(EdPhyLocationDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdPhyLocation> getAlledPhyLocations() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_PHY_LOCATION";
		RowMapper<EdPhyLocation> rowMapper = new EdPhyLocationRowMapper();
		List<EdPhyLocation> result = new ArrayList<EdPhyLocation>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledPhyLocations access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledPhyLocations RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
