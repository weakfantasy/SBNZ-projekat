package com.ftn.sbnz.anxietycheck.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StressLevel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable=true, unique=false)
	private int stressPoints;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=true, unique=false)
	private StressCategory stress;
	
	

	public StressLevel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public StressLevel(int stressPoints, StressCategory stress) {
		super();
		this.stressPoints = stressPoints;
		this.stress = stress;
	}


	public int getStressPoints() {
		return stressPoints;
	}

	public void setStressPoints(int stressPoints) {
		this.stressPoints = stressPoints;
	}

	public StressCategory getStress() {
		return stress;
	}

	public void setStress(StressCategory stress) {
		this.stress = stress;
	}
	
	

}
