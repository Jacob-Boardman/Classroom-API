package com.qa.persistence.repository;

public interface ClassroomRepository {
	
	String createClassroom(String classroom);
	
	String getAllClassrooms();
	
	String updateClassroom(Long id, String classroom);
	
	String deleteClassroom(Long id);
}
