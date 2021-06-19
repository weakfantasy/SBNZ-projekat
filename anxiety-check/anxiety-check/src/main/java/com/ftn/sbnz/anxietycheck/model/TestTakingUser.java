package com.ftn.sbnz.anxietycheck.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.ftn.sbnz.anxietycheck.dto.TestTakerDTO;

@Entity
public class TestTakingUser extends User {
	
	
	
	@Column(unique=false, columnDefinition = "int default 0")
	private int stressPoints;
	
	@Column(nullable=true, unique=false)
	private StressCategory stress;
	
	@ElementCollection(targetClass = RiskFactors.class)
    @CollectionTable(name = "risk_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<RiskFactors> riskFactors = new HashSet<RiskFactors>();

	@ElementCollection(targetClass = PredominantSymptoms.class)
    @CollectionTable(name = "predominant_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<PredominantSymptoms> predominantSymptoms = new HashSet<PredominantSymptoms>(); 
	
	@ElementCollection(targetClass = CommonAnxietySymptoms.class)
    @CollectionTable(name = "common_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<CommonAnxietySymptoms> commonSymptoms = new HashSet<CommonAnxietySymptoms>(); 
	
	@ElementCollection(targetClass = CommonAnxietySymptoms.class)
    @CollectionTable(name = "depression_user", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
	private Set<DepressionSymptoms> depressionSymptoms = new HashSet<DepressionSymptoms>();
	
	/*
	 * @Column(unique = false, nullable = true)
	 * 
	 * @OneToMany(fetch = FetchType.EAGER, mappedBy = "testTakingUser") private
	 * List<Diagnosis> history;
	 */
	
	@Column(columnDefinition = "boolean default false")
	private boolean anxious;
	
	@Column(columnDefinition = "boolean default false")
	private boolean predisposed;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	private Depression depression;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	private AnxietyDisorder anxietyDisorder;
	
	@ManyToMany
	 @JoinTable(name = "user_diagnosis")
	private List<Diagnosis> diagnosis;
	
	@Column(unique = false)
	private LocalDate start;
	
	@Column(unique = false)
	private LocalDate startOfTherapy;
	
	public TestTakingUser() {
		this.diagnosis = new ArrayList<Diagnosis>();
		this.commonSymptoms = new HashSet<CommonAnxietySymptoms>();
		this.depressionSymptoms = new HashSet<DepressionSymptoms>();
		this.predominantSymptoms = new HashSet<PredominantSymptoms>();
		this.riskFactors = new HashSet<RiskFactors>();
		
	}
	
	public TestTakingUser(TestTakerDTO ttDto) {
		this.riskFactors = ttDto.getRiskFactors();
		this.commonSymptoms = ttDto.getCommonSympotms();
		this.predominantSymptoms = ttDto.getPredominantSymptoms();
		this.stressPoints = ttDto.getStressPoints();
		this.start = ttDto.getStart();
		this.depressionSymptoms = ttDto.getDepressionSymptoms();
		if(diagnosis == null) {
			diagnosis = new ArrayList<Diagnosis>();
		}
			
	}
	


	public TestTakingUser(Long id, int stressPoints, StressCategory stress, Set<RiskFactors> riskFactors,
			Set<PredominantSymptoms> predominantSymptoms, Set<CommonAnxietySymptoms> commonSympotms, boolean anxiety,
			List<Diagnosis> diagnosis) {
		super();
		this.id = id;
		this.stressPoints = stressPoints;
		this.stress = stress;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSymptoms = commonSympotms;
		this.anxious = anxiety;
		this.diagnosis = diagnosis;
	}
	

	public TestTakingUser(Long id, int stressPoints, StressCategory stress, Set<RiskFactors> riskFactors,
			Set<PredominantSymptoms> predominantSymptoms, Set<CommonAnxietySymptoms> commonSympotms, boolean anxiety,
			List<Diagnosis> diagnosis, LocalDate start) {
		super();
		this.id = id;
		this.stressPoints = stressPoints;
		this.stress = stress;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSymptoms = commonSympotms;
		this.anxious = anxiety;
		this.diagnosis = diagnosis;
		this.start = start;
	}
	
	

	public TestTakingUser(Long id, int stressPoints, StressCategory stress, Set<RiskFactors> riskFactors,
			Set<PredominantSymptoms> predominantSymptoms, Set<CommonAnxietySymptoms> commonSympotms,
			Set<DepressionSymptoms> depressionSymptoms, boolean anxiety, Depression depression,
			AnxietyDisorder anxietyDisorder, List<Diagnosis> diagnosis, LocalDate start) {
		super();
		this.id = id;
		this.stressPoints = stressPoints;
		this.stress = stress;
		this.riskFactors = riskFactors;
		this.predominantSymptoms = predominantSymptoms;
		this.commonSymptoms = commonSympotms;
		this.depressionSymptoms = depressionSymptoms;
		this.anxious = anxiety;
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


	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public void addDiagnosis(Diagnosis diagnosis) {
		this.diagnosis.add(diagnosis);
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

	public LocalDate getStartOfTherapy() {
		return startOfTherapy;
	}

	public void setStartOfTherapy(LocalDate startOfTherapy) {
		this.startOfTherapy = startOfTherapy;
	}

	public boolean isPredisposed() {
		return predisposed;
	}

	public void setPredisposed(boolean isPredisposed) {
		this.predisposed = isPredisposed;
	}

	public boolean isAnxious() {
		return anxious;
	}

	public void setAnxious(boolean isAnxious) {
		this.anxious = isAnxious;
	} 
	
	
	
	
	

}
