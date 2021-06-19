package com.ftn.sbnz.anxietycheck.dto;

import com.ftn.sbnz.anxietycheck.model.StressCategory;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

public class TestTakerResponseDTO {
	
	StressCategory stressLevel;
	boolean anxious;
	boolean predisposed;
	String diagnosisName;
	String therapyName;
	String therapyDesc;
	
	
	
	
	public TestTakerResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TestTakerResponseDTO(StressCategory stressLevel, boolean anxious, boolean predisposed, String diagnosisName,
			String therapyName, String therapyDesc) {
		super();
		this.stressLevel = stressLevel;
		this.anxious = anxious;
		this.predisposed = predisposed;
		this.diagnosisName = diagnosisName;
		this.therapyName = therapyName;
		this.therapyDesc = therapyDesc;
	}
	
	public TestTakerResponseDTO(TestTakingUser user) {
		this.stressLevel = user.getStress();
		this.anxious = user.isAnxious();
		this.predisposed = user.isPredisposed();
		if(!user.getDiagnosis().isEmpty()) {
			this.diagnosisName = user.getDiagnosis().get(user.getDiagnosis().size() - 1).getName();
			this.therapyName = user.getDiagnosis().get(user.getDiagnosis().size() - 1).getTherapy().getName();
			this.therapyDesc =  user.getDiagnosis().get(user.getDiagnosis().size() - 1).getTherapy().getDescription();
		}else {
			this.diagnosisName = "";
			this.therapyName = "";
			this.therapyDesc = "";
		}
	}



	public StressCategory getStressLevel() {
		return stressLevel;
	}
	public void setStressLevel(StressCategory stressLevel) {
		this.stressLevel = stressLevel;
	}
	public boolean isAnxious() {
		return anxious;
	}
	public void setAnxious(boolean anxious) {
		this.anxious = anxious;
	}
	public boolean isPredisposed() {
		return predisposed;
	}
	public void setPredisposed(boolean predisposed) {
		this.predisposed = predisposed;
	}
	public String getDiagnosisName() {
		return diagnosisName;
	}
	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}
	public String getTherapyName() {
		return therapyName;
	}
	public void setTherapyName(String therapyName) {
		this.therapyName = therapyName;
	}
	public String getTherapyDesc() {
		return therapyDesc;
	}
	public void setTherapyDesc(String therapyDesc) {
		this.therapyDesc = therapyDesc;
	}
	
	
	
	

}
