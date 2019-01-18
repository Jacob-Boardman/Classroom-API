package com.qa.service;

public interface TraineeService {
	
	String createTrainee(String trainee);
	
	String getTrainee();
	
	String updateTrainee(Long id, String trainee);
	
	String deleteTrainee(Long id);

}
