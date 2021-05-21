package com.ftn.sbnz.anxietycheck.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.ftn.sbnz.anxietycheck.dto.TestTakerDTO;

@Entity
public class TestTakingUser extends User {
	

	
	@Column(nullable=true, unique=false)
	private int stressPoints;
	
	@Column(nullable=true, unique=false)
	private StressCategory stress;
	
	@ElementCollection(targetClass = RiskFactors.class)
    @CollectionTable(name = "risk_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<RiskFactors> riskFactors; 

	@ElementCollection(targetClass = PredominantSymptoms.class)
    @CollectionTable(name = "predominant_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<PredominantSymptoms> predominantSymptoms; 
	
	@ElementCollection(targetClass = CommonAnxietySymptoms.class)
    @CollectionTable(name = "common_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<CommonAnxietySymptoms> commonSympotms; 
	
	@Column(unique = false, nullable = true)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "testTakingUser")
	private Set<Diagnosis> history;
	
	
	public TestTakingUser() {
		super();
	}
	
	public TestTakingUser(TestTakerDTO ttDto) {
		this.riskFactors = ttDto.getRiskFactors();
		this.commonSympotms = ttDto.getCommonSympotms();
		this.predominantSymptoms = ttDto.getPredominantSymptoms();
		this.stressPoints = ttDto.getStressPoints();
		this.history = null;
		this.stress = null;
	}
	

	public TestTakingUser(Long id, Set<RiskFactors> riskFactors, Set<PredominantSymptoms> predominantSymptoms,
			Set<CommonAnxietySymptoms> commonSympotms, Set<Diagnosis> history, int stressPoint) {
		super();
		this.id = id;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSympotms = commonSympotms;
		this.history = history;
		this.stressPoints = stressPoint;
	}

	

	public int getStressPoints() {
		return stressPoints;
	}


	public void setStressPoints(int stressPoints) {
		this.stressPoints = stressPoints;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<RiskFactors> getRiskFactors() {
		return riskFactors;
	}

	public void setRiskFactors(Set<RiskFactors> riskFactors) {
		this.riskFactors = riskFactors;
	}

	public Set<PredominantSymptoms> getPredominantSymptoms() {
		return predominantSymptoms;
	}

	public void setPredominantSymptoms(Set<PredominantSymptoms> predominantSymptoms) {
		this.predominantSymptoms = predominantSymptoms;
	}

	public Set<CommonAnxietySymptoms> getCommonSympotms() {
		return commonSympotms;
	}

	public void setCommonSympotms(Set<CommonAnxietySymptoms> commonSympotms) {
		this.commonSympotms = commonSympotms;
	}

	public Set<Diagnosis> getHistory() {
		return history;
	}

	public void setHistory(Set<Diagnosis> history) {
		this.history = history;
	}

	public StressCategory getStress() {
		return stress;
	}

	public void setStress(StressCategory stress) {
		this.stress = stress;
	} 
	
	
	

}
