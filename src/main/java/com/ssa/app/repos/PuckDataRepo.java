package com.ssa.app.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ssa.app.controllers.PuckData;

@Repository
public class PuckDataRepo {

	@PersistenceContext
	EntityManager entityManager;

	public List<PuckData> doSomeQuery() {
		Query query = entityManager.createNativeQuery("SELECT puck.puck_name as puckName, \r\n"
				+ "environment.owner_name as environmentName,\r\n" + "\"owner\".owner_name as ownerName\r\n"
				+ "FROM puck\r\n" + "INNER JOIN environment ON environment.env_key = puck.env_key\r\n"
				+ "INNER JOIN puck_family ON puck_family.puck_family_key = puck.puck_family_key\r\n"
				+ "INNER JOIN \"owner\"  ON \"owner\".id = puck_family.owner_key");
		System.out.println(query.getResultList());
		@SuppressWarnings("unchecked")
		List<Object[]> rows = query.getResultList();
		List<PuckData> result = new ArrayList<>(rows.size());
		for (Object[] row : rows) {
			result.add(new PuckData((String) row[0], (String) row[1], (String) row[2]));
		}
		return result;
	}
}
