package com.ftn.sbnz.anxietycheck.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Diagnosis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = false, nullable = false)
	private LocalDate datum;
	
	@Column(unique = false, nullable = false)
	private int stressLevel;
	
	@Column(unique = false, nullable = false)
	private boolean anxiety;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Therapy therapy;
	
	@OneToOne(fetch = FetchType.EAGER)
	private AnxietyDisorder disorder;
	
	public Diagnosis() {
		super();
	}
	
	public Diagnosis(LocalDate datum, AnxietyDisorder disorder, int stress, boolean anxiety, Therapy therapy) {
		super();
		this.datum = datum;
		this.disorder = disorder;
		this.stressLevel = stress;
		this.anxiety = anxiety;
		this.therapy = therapy;
	}

	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public AnxietyDisorder getDisorder() {
		return disorder;
	}
	public void setDisorder(AnxietyDisorder disorder) {
		this.disorder = disorder;
	}
	public int getStress() {
		return stressLevel;
	}
	public void setStress(int stress) {
		this.stressLevel = stress;
	}
	public boolean isAnxiety() {
		return anxiety;
	}
	public void setAnxiety(boolean anxiety) {
		this.anxiety = anxiety;
	}
	public Therapy getTherapy() {
		return therapy;
	}
	public void setTherapy(Therapy therapy) {
		this.therapy = therapy;
	}
	
	

}
