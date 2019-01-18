package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.util.JSONUtil;

import java.util.Collection;


@Transactional(SUPPORTS)
public class TraineeDBRepository implements TraineeRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;


	@Transactional(REQUIRED)
	public String createTrainee() {
		
		return null;
	}

	public String getTrainee() {
		
		return null;
	}

	@Transactional(REQUIRED)
	public String updateTrainee() {
		
		return null;
	}

	@Transactional(REQUIRED)
	public String deleteTrainee() {
		
		return null;
	}

}
