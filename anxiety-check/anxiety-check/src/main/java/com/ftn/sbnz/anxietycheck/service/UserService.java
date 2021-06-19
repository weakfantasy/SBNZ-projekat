package com.ftn.sbnz.anxietycheck.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.AnxietyDisorder;
import com.ftn.sbnz.anxietycheck.model.Depression;
import com.ftn.sbnz.anxietycheck.model.Diagnosis;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;
import com.ftn.sbnz.anxietycheck.repository.UserRepository;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	
	private final DisorderService disorderService;
	private final DepressionService depressionService;
	private final DiagnosisService diagnosisService;
	private final TestTakingUserService testTakingUserService;
	
	private final KieContainer kieContainer;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	public UserService(KieContainer kieContainer, DisorderService disorderService, DepressionService depressionService,  DiagnosisService diagnosisService,TestTakingUserService testTakingUserService) {
		System.out.println("Checking");
		log.info("Initialising a new example session.");
		this.disorderService = disorderService;
		this.depressionService = depressionService;
		this.kieContainer = kieContainer;
		this.diagnosisService = diagnosisService;
		this.testTakingUserService = testTakingUserService;
	}

	public void getStressLevel(TestTakingUser testTakingUser) {
		
		List<AnxietyDisorder> disorders = disorderService.getAll();
		List<Depression> depressions = depressionService.getAll();
		List<Diagnosis> diagnosis = diagnosisService.findAll();
		
		System.out.println("Checking");

		KieSession kieSession = kieContainer.newKieSession("test-session");
		
		disorders.forEach(kieSession::insert);
		depressions.forEach(kieSession::insert);
		diagnosis.forEach(kieSession::insert);
		
		

		kieSession.insert(testTakingUser);
		
		
		kieSession.getAgenda().getAgendaGroup("stressLevel").setFocus();
		kieSession.fireAllRules();
		
		kieSession.getAgenda().getAgendaGroup("anxiety").setFocus();
		kieSession.fireAllRules();
		
		kieSession.getAgenda().getAgendaGroup("disorder").setFocus();
		kieSession.fireAllRules();
		
		
		kieSession.getAgenda().getAgendaGroup("depression").setFocus();
		kieSession.fireAllRules();
		
		kieSession.getAgenda().getAgendaGroup("risk-factors").setFocus();
		kieSession.fireAllRules();
		
		
		kieSession.getAgenda().getAgendaGroup("diagnosis").setFocus();
		kieSession.fireAllRules();

		kieSession.getAgenda().getAgendaGroup("special-diagnosis").setFocus();
		kieSession.fireAllRules();

		System.out.println("DONE");
	
		testTakingUserService.save(testTakingUser);
		System.out.println("try save");
		
		kieSession.dispose();
	}
	

}
