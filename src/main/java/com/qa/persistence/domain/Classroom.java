package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long classroomId;
	
	private String trainer;
	private Long trainees;

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
