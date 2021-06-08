package com.ftn.sbnz.anxietycheck.dto;

import java.time.LocalDate;
import java.util.Set;

import com.ftn.sbnz.anxietycheck.model.CommonAnxietySymptoms;
import com.ftn.sbnz.anxietycheck.model.DepressionSymptoms;
import com.ftn.sbnz.anxietycheck.model.PredominantSymptoms;
import com.ftn.sbnz.anxietycheck.model.RiskFactors;
import com.ftn.sbnz.anxietycheck.model.StressCategory;

public class TestTakerDTO {
	
	
	private int stressPoints;
	
	private Set<RiskFactors> riskFactors; 

	private Set<PredominantSymptoms> predominantSymptoms; 

	private Set<CommonAnxietySymptoms> commonSympotms;
	
	private Set<DepressionSymptoms> depressionSymptoms;
	
	private LocalDate start;
	

	public TestTakerDTO(int stressPoints, Set<RiskFactors> riskFactors, Set<PredominantSymptoms> predominantSymptoms,
			Set<CommonAnxietySymptoms> commonSympotms, LocalDate start, Set<DepressionSymptoms> depressionSymptoms) {
		super();
		this.stressPoints = stressPoints;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSympotms = commonSympotms;
		this.start = start;
		this.depressionSymptoms = depressionSymptoms;
	}

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

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public Set<DepressionSymptoms> getDepressionSymptoms() {
		return depressionSymptoms;
	}

	public void setDepressionSymptoms(Set<DepressionSymptoms> depressionSymptoms) {
		this.depressionSymptoms = depressionSymptoms;
	}


	
	

}
