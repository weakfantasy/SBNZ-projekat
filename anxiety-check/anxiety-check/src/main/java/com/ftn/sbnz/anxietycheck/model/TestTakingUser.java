package com.ftn.sbnz.anxietycheck.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	private Set<CommonAnxietySymptoms> commonSymptoms; 
	
	@ElementCollection(targetClass = CommonAnxietySymptoms.class)
    @CollectionTable(name = "depression_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<DepressionSymptoms> depressionSymptoms; 
	
	/*
	 * @Column(unique = false, nullable = true)
	 * 
	 * @OneToMany(fetch = FetchType.EAGER, mappedBy = "testTakingUser") private
	 * Set<Diagnosis> history;
	 */
	
	private boolean anxiety;
	
	@OneToOne
	private Depression depression;
	
	@OneToOne
	private AnxietyDisorder anxietyDisorder;
	
	@OneToOne
	private Diagnosis diagnosis;
	
	@Column(unique = false)
	private LocalDate start;
	
	
	public TestTakingUser() {
		super();
	}
	
	public TestTakingUser(TestTakerDTO ttDto) {
		this.riskFactors = ttDto.getRiskFactors();
		this.commonSymptoms = ttDto.getCommonSympotms();
		this.predominantSymptoms = ttDto.getPredominantSymptoms();
		this.stressPoints = ttDto.getStressPoints();
		this.start = ttDto.getStart();
		this.depressionSymptoms = ttDto.getDepressionSymptoms();
	}
	


	public TestTakingUser(Long id, int stressPoints, StressCategory stress, Set<RiskFactors> riskFactors,
			Set<PredominantSymptoms> predominantSymptoms, Set<CommonAnxietySymptoms> commonSympotms, boolean anxiety,
			Diagnosis diagnosis) {
		super();
		this.id = id;
		this.stressPoints = stressPoints;
		this.stress = stress;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSymptoms = commonSympotms;
		this.anxiety = anxiety;
		this.diagnosis = diagnosis;
	}
	

	public TestTakingUser(Long id, int stressPoints, StressCategory stress, Set<RiskFactors> riskFactors,
			Set<PredominantSymptoms> predominantSymptoms, Set<CommonAnxietySymptoms> commonSympotms, boolean anxiety,
			Diagnosis diagnosis, LocalDate start) {
		super();
		this.id = id;
		this.stressPoints = stressPoints;
		this.stress = stress;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSymptoms = commonSympotms;
		this.anxiety = anxiety;
		this.diagnosis = diagnosis;
		this.start = start;
	}
	
	

	public TestTakingUser(Long id, int stressPoints, StressCategory stress, Set<RiskFactors> riskFactors,
			Set<PredominantSymptoms> predominantSymptoms, Set<CommonAnxietySymptoms> commonSympotms,
			Set<DepressionSymptoms> depressionSymptoms, boolean anxiety, Depression depression,
			AnxietyDisorder anxietyDisorder, Diagnosis diagnosis, LocalDate start) {
		super();
		this.id = id;
		this.stressPoints = stressPoints;
		this.stress = stress;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSymptoms = commonSympotms;
		this.depressionSymptoms = depressionSymptoms;
		this.anxiety = anxiety;
		this.depression = depression;
		this.anxietyDisorder = anxietyDisorder;
		this.diagnosis = diagnosis;
		this.start = start;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public boolean isAnxiety() {
		return anxiety;
	}

	public void setAnxiety(boolean anxiety) {
		this.anxiety = anxiety;
	}

	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
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

	public Set<CommonAnxietySymptoms> getCommonSymptoms() {
		return commonSymptoms;
	}

	public void setCommonSymptoms(Set<CommonAnxietySymptoms> commonSympotms) {
		this.commonSymptoms = commonSympotms;
	}


	public StressCategory getStress() {
		return stress;
	}

	public void setStress(StressCategory stress) {
		this.stress = stress;
	}

	public Set<DepressionSymptoms> getDepressionSymptoms() {
		return depressionSymptoms;
	}

	public void setDepressionSymptoms(Set<DepressionSymptoms> depressionSymptoms) {
		this.depressionSymptoms = depressionSymptoms;
	}

	public Depression getDepression() {
		return depression;
	}

	public void setDepression(Depression depression) {
		this.depression = depression;
	}

	public AnxietyDisorder getAnxietyDisorder() {
		return anxietyDisorder;
	}

	public void setAnxietyDisorder(AnxietyDisorder anxietyDisorder) {
		this.anxietyDisorder = anxietyDisorder;
	} 
	

}
