package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;

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
	private ArrayList[] trainees;
	
	public Classroom() {};
	
	public Classroom(Long id, String trainer, ArrayList[] trainees) {
		this.setTrainer(trainer);
		this.setTrainees(trainees);
		
	}
	
	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public ArrayList[] getTrainees() {
		return trainees;
	}

	public void setTrainees(ArrayList[] trainees) {
		this.trainees = trainees;
	}

}
