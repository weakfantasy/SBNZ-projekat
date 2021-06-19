package com.ftn.sbnz.anxietycheck.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Diagnosis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = false)
	private String name;
	
	@Column(unique = false, nullable=true)
	private LocalDate date;
	
	@Column(unique = false)
	private boolean anxiety;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	private Depression depression;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	private Therapy therapy;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	private AnxietyDisorder disorder;
	
	public Diagnosis() {
		super();
	}
	
	public Diagnosis(LocalDate datum, AnxietyDisorder disorder, boolean anxiety, Therapy therapy, Depression depression) {
		super();
		this.date = datum;
		this.disorder = disorder;
		this.anxiety = anxiety;
		this.therapy = therapy;
		this.depression = depression;
		
	}

	public Diagnosis(Long id, String name, LocalDate datum, boolean anxiety, Therapy therapy,
			AnxietyDisorder disorder, Depression depression) {
		super();
		this.id = id;
		this.name = name;
		this.date = datum;
		this.anxiety = anxiety;
		this.therapy = therapy;
		this.disorder = disorder;
		this.depression = depression;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public AnxietyDisorder getDisorder() {
		return disorder;
	}
	public void setDisorder(AnxietyDisorder disorder) {
		this.disorder = disorder;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Depression getDepression() {
		return depression;
	}

	public void setDepression(Depression depression) {
		this.depression = depression;
	}

	

}
