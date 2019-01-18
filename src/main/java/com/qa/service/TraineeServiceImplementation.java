package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.TraineeRepository;

public class TraineeServiceImplementation implements TraineeService {

	@Inject
	private TraineeRepository repo;

	public String createTrainee(String trainee) {

		return repo.createTrainee(trainee);
	}

	public String getAllTrainees() {
		
		return repo.getAllTrainees();
	}

	public String updateTrainee(Long id, String trainee) {
		
		return repo.updateTrainee(id, trainee);
	}

	public String deleteTrainee(Long id) {
		
		return repo.deleteTrainee(id);
	}

}
