package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

import java.util.Collection;


@Transactional(SUPPORTS)
public class TraineeDBRepository implements TraineeRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTrainee() {
		Query query = manager.createQuery("SELECT t FROM Trainee t");
		Collection<Trainee> trainees = (Collection<Trainee>)query.getResultList();
		return util.getJSONForObject(trainees);
	}
	
	@Transactional(REQUIRED)
	public String updateTrainee(Long id, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
