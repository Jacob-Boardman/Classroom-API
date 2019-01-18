package com.qa.service;

public interface TraineeService {
	
	String createTrainee(String trainee);
	
	String getAllTrainees();
	
	String updateTrainee(Long id, String trainee);
	
	String deleteTrainee(Long id);

}
