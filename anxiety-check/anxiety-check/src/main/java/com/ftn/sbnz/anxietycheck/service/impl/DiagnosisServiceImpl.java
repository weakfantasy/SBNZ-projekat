package com.ftn.sbnz.anxietycheck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.Diagnosis;
import com.ftn.sbnz.anxietycheck.repository.DiagnosisRepository;
import com.ftn.sbnz.anxietycheck.service.DiagnosisService;

@Service
public class DiagnosisServiceImpl implements DiagnosisService{

	@Autowired
	DiagnosisRepository diagnosisRepository;

	public Diagnosis findOneByName(String name) {
		
		return diagnosisRepository.findOneByName(name);
	}


	public List<Diagnosis> findAll() {
		
		return diagnosisRepository.findAll();
	}


}
