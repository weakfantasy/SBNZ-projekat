package com.ftn.sbnz.anxietycheck.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Depression {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = false)
	private String name;

	@Enumerated(EnumType.STRING)
	private DepressionType depressionType;
	
	@ElementCollection(targetClass = DepressionSymptoms.class)
    @CollectionTable(name = "depression_symptoms", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<DepressionSymptoms> depressionSymptoms; 

	public Depression() {
		super();
		
	}

	
	public Depression(Long id, String name, DepressionType type, Set<DepressionSymptoms> depressionSymptoms) {
		super();
		this.id = id;
		this.name = name;
		this.depressionType = type;
		this.depressionSymptoms = depressionSymptoms;
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

	public DepressionType getType() {
		return depressionType;
	}

	public void setType(DepressionType type) {
		this.depressionType = type;
	}

	public Set<DepressionSymptoms> getDepressionSymptoms() {
		return depressionSymptoms;
	}

	public void setDepressionSymptoms(Set<DepressionSymptoms> depressionSymptoms) {
		this.depressionSymptoms = depressionSymptoms;
	}
	
	
	
}
