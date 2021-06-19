package com.ftn.sbnz.anxietycheck.dto;

import com.ftn.sbnz.anxietycheck.model.Diagnosis;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

public class DiagnosisResponseDTO {
	
	String diagnosisName;
	String therapyName;
	String therapyDesc;
	
	
	
	public DiagnosisResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DiagnosisResponseDTO(Diagnosis diagnosis) {
	
			this.diagnosisName = diagnosis.getName();
			this.therapyName = diagnosis.getTherapy().getName();
			this.therapyDesc =  diagnosis.getTherapy().getDescription();
		
	}

	public DiagnosisResponseDTO(String diagnosisName, String therapyName,
			String therapyDesc) {
		super();
		this.diagnosisName = diagnosisName;
		this.therapyName = therapyName;
		this.therapyDesc = therapyDesc;
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
