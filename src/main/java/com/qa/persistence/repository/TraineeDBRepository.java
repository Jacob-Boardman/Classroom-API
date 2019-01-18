package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

import java.util.Collection;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineeRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee newTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(newTrainee);
		return "{Message : Created a Trainee}";
	}

	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT t FROM Trainee t");
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainees);
	}

	@Transactional(REQUIRED)
	public String updateTrainee(Long id, String trainee) {
		Trainee foundTrainee = findTrainee(id);
		Trainee updatedTrainee = util.getObjectForJSON(trainee, Trainee.class);
		if (foundTrainee != null) {
			manager.remove(foundTrainee);
			manager.persist(updatedTrainee);
			return "{Message :  Updated the Trainee}";
		}

		return "{Message :  Could not update Trainee, or no Trainee found}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		Trainee foundTrainee = findTrainee(id);
		if (foundTrainee != null) {
			manager.remove(foundTrainee);
			return "{Message : Trainee has been deleted}";
		}
		return "{Message : Trainee is not found}";
	}

	public Trainee findTrainee(Long id) {
		return manager.find(Trainee.class, id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}
}
