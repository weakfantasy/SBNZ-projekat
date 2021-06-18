package com.ftn.sbnz.anxietycheck.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.Diagnosis;


public interface DiagnosisService {

	Diagnosis findOneByName(String name);
	List<Diagnosis> findAll(); 

}
