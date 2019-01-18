package com.qa.persistence.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private String trainer;
	private ArrayList<Trainee> trainees;

	public Classroom() {
	};

	public Classroom(Long id, String trainer, ArrayList<Trainee> trainees) {
		this.setTrainer(trainer);
		this.setTrainees(trainees);

	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(ArrayList<Trainee> trainees2) {
		this.trainees = trainees2;
	}

}
