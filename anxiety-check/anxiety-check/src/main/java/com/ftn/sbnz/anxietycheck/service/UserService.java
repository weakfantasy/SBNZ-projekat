package com.ftn.sbnz.anxietycheck.service;

import java.util.List;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.AnxietyDisorder;
import com.ftn.sbnz.anxietycheck.model.Depression;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	private final DisorderService disorderService;
	private final DepressionService depressionService;
	@Autowired
	private KieSession kieSession;

	@Autowired
	public UserService(KieSession kieSession, DisorderService disorderService, DepressionService depressionService) {
		System.out.println("Checking");
		log.info("Initialising a new example session.");
		this.disorderService = disorderService;
		this.depressionService = depressionService;
		this.kieSession = kieSession;
	}

	public void getStressLevel(TestTakingUser testTakingUser) {
		
		List<AnxietyDisorder> disorders = disorderService.getAll();
		List<Depression> depressions = depressionService.getAll();
		
		System.out.println("Checking");

		kieSession.insert(testTakingUser);
		
		for(AnxietyDisorder d : disorders) {
			kieSession.insert(d);
		}
		
		for(Depression d : depressions) {
			kieSession.insert(d);
		}
		
		kieSession.fireAllRules();
		System.out.println("Rules done and now dispose");

		System.out.println(testTakingUser.getStress() + " stres service");
		System.out.println(testTakingUser.isAnxiety() + " ANKS service");
		System.out.println("try save");
		
	}

}
