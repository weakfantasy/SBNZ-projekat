package com.ftn.sbnz.anxietycheck.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(TestTakingUser.class);

	@Autowired
	private KieContainer kieContainer;

	@Autowired
	public UserService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}
	
	public void getStressLevel(TestTakingUser testTakingUser) {
		
	
		KieSession kieSession = kieContainer.newKieSession("test-session");
		kieSession.insert(testTakingUser);
		kieSession.fireAllRules();
		kieSession.dispose();
	}

}
