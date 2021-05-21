package com.ftn.sbnz.anxietycheck.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.AnxietyDisorder;

@Service
public class DisorderService {

	private static final Logger log = LoggerFactory.getLogger(AnxietyDisorder.class);

	@Autowired
	private KieContainer kieContainer;

	@Autowired
	public DisorderService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	
}