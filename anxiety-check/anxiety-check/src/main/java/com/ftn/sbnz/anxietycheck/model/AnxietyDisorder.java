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
public class AnxietyDisorder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@ElementCollection(targetClass = PredominantSymptoms.class)
    @CollectionTable(name = "predominant_disorder", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<PredominantSymptoms> predominantSymptoms;
	
	public AnxietyDisorder() {
		super();
	}
	
	public AnxietyDisorder(String name, Set<PredominantSymptoms> predominantSymptoms) {
		super();
		this.name = name;
		this.predominantSymptoms = predominantSymptoms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<PredominantSymptoms> getPredominantSymptoms() {
		return predominantSymptoms;
	}
	public void setPredominantSymptoms(Set<PredominantSymptoms> predominantSymptoms) {
		this.predominantSymptoms = predominantSymptoms;
	}
	
	

}
