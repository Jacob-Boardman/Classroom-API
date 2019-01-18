package com.qa.persistence.repository;

public interface TraineeRepository {
	
	String createTrainee(String trainee);
	
	String getAllTrainees();
	
	String updateTrainee(Long id, String trainee);
	
	String deleteTrainee(Long id);

}
