package com.qa.persistence.domain;

import java.security.acl.Group;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomId;
	
	private String trainer;
	private Long trainees;
	
	@OneToMany(mappedBy="classroom")
	@JoinTable(name="CLASROOM_GROUP",
	    joinColumns = @JoinColumn(name = "classroomId", 
	                              referencedColumnName = "classroomId"), 
	    inverseJoinColumns = @JoinColumn(name = "trainId", 
	                              referencedColumnName = "trainId"))
	Group classroom;

	public Classroom() {
	};

	public Classroom(Long id, String trainer, Long trainees) {
		this.setTrainer(trainer);
		this.setTrainees(trainees);
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Long getTrainees() {
		return trainees;
	}

	public void setTrainees(Long trainees2) {
		this.trainees = trainees2;
	}

}
