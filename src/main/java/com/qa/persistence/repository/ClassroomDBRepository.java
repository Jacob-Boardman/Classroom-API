package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

import java.util.Collection;

@Transactional(SUPPORTS)
public class ClassroomDBRepository implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Transactional(REQUIRED)
	public String createClassroom(String classroom) {
		Classroom newClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(newClassroom);
		return "{Message : Created a classroom}";
	}

	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT c FROM Classroom c");
		Collection<Classroom> classrooms = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
	}

	@Transactional(REQUIRED)
	public String updateClassroom(Long id, String classroom) {
		Classroom foundClassroom = findClassroom(id);
		Classroom updatedClassroom = util.getObjectForJSON(classroom, Classroom.class);
		if (foundClassroom != null) {
			manager.remove(id);
			manager.persist(updatedClassroom);
			return "{Message :  Updated the classroom}";
		}
		return "{Message :  Could not update classroom, or no classroom found}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		Classroom foundClassroom = findClassroom(id);
		if (foundClassroom != null) {
			manager.remove(foundClassroom);
			return "{Message : Classroom has been deleted}";
		}

		return "{Message : Classroom is not found}";
	}

	private Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
