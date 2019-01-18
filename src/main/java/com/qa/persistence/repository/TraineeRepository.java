package com.qa.persistence.repository;

public interface TraineeRepository {
	
	String createTrainee(String trainee);
	
	String getTrainee();
	
	String updateTrainee(Long id, String trainee);
	
	String deleteTrainee(Long id);

}
