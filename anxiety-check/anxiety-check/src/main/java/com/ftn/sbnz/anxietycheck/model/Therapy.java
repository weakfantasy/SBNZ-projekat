package com.ftn.sbnz.anxietycheck.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Therapy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@Column(unique = false, nullable = false)
	private TherapyType type;
	
	@Column(unique = true, nullable = false)
	private String description;
	
	
	
	public Therapy() {
		super();
	}
	
	public Therapy(String name, TherapyType type, String description) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TherapyType getType() {
		return type;
	}
	public void setType(TherapyType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
