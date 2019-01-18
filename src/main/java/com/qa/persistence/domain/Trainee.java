package com.qa.persistence.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeId;
	private	Long classroomId;
	private String name;
	
	@ManyToOne
	Set<Classroom> classroom;

	public Trainee() {
	}

	public Trainee(String name, Long classroomId) {
		this.setName(name);
		this.setClassroomId(classroomId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

}
