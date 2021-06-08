package com.ftn.sbnz.anxietycheck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.AnxietyDisorder;
import com.ftn.sbnz.anxietycheck.repository.DisorderRepository;
import com.ftn.sbnz.anxietycheck.service.DisorderService;

@Service
public class DisorderServiceImpl implements DisorderService {
	
	@Autowired
	DisorderRepository disorderRepository;

	public List<AnxietyDisorder> getAll() {
		return disorderRepository.findAll();
	}

}
