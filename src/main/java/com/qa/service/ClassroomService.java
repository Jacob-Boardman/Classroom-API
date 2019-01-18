package com.qa.service;

public interface ClassroomService {
	
	String createClassroom(String classroom);
	
	String getAllClassrooms();
	
	String updateClassroom(Long id, String classroom);
	
	String deleteClassroom(Long id);

}
