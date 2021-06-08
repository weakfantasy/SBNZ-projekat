package com.ftn.sbnz.anxietycheck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.Depression;
import com.ftn.sbnz.anxietycheck.repository.DepressionRepository;
import com.ftn.sbnz.anxietycheck.service.DepressionService;

@Service
public class DepressionServiceImpl implements DepressionService {
	
	@Autowired
	DepressionRepository depressionRepository;

	public List<Depression> getAll() {
		
		return depressionRepository.findAll();
	}

}
