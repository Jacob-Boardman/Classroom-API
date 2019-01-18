package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;


public class ClassroomServiceImplementaion implements ClassroomService {
	
	@Inject
	private ClassroomRepository repo;
	
	public String createClassroom(String classroom) {
		
		return repo.createClassroom(classroom);
	}

	public String getAllClassrooms() {
		
		return repo.getAllClassrooms();
	}

	public String updateClassroom(Long id, String classroom) {
		
		return repo.updateClassroom(id, classroom);
	}

	public String deleteClassroom(Long id) {
		
		return repo.deleteClassroom(id);
	}

}
