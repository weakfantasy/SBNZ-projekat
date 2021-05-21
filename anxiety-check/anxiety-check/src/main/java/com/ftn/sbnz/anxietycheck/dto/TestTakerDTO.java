package com.ftn.sbnz.anxietycheck.dto;

import java.util.Set;

import com.ftn.sbnz.anxietycheck.model.CommonAnxietySymptoms;
import com.ftn.sbnz.anxietycheck.model.PredominantSymptoms;
import com.ftn.sbnz.anxietycheck.model.RiskFactors;
import com.ftn.sbnz.anxietycheck.model.StressCategory;

public class TestTakerDTO {
	
	private StressCategory stressLevel;
	
	private int stressPoints;
	
	private Set<RiskFactors> riskFactors; 

	private Set<PredominantSymptoms> predominantSymptoms; 

	private Set<CommonAnxietySymptoms> commonSympotms;
	
	

	public TestTakerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestTakerDTO(int stressPoints, Set<RiskFactors> riskFactors, Set<PredominantSymptoms> predominantSymptoms,
			Set<CommonAnxietySymptoms> commonSympotms,StressCategory stressLevel) {
		super();
		this.stressPoints = stressPoints;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSympotms = commonSympotms;
		this.stressLevel = stressLevel;
	}

	public int getStressPoints() {
		return stressPoints;
	}

	public void setStressPoints(int stressPoints) {
		this.stressPoints = stressPoints;
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

	public StressCategory getStressLevel() {
		return stressLevel;
	}

	public void setStressLevel(StressCategory stressLevel) {
		this.stressLevel = stressLevel;
	} 
	
	

}
