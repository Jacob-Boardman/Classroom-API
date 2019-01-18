package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;


public class ClassroomServiceImplementaion implements ClassroomService {
	
	@Inject
	private ClassroomRepository repo;
	
	public String createClassroom(String classroom) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllClassrooms() {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateClassroom(Long id, String classroom) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteClassroom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
