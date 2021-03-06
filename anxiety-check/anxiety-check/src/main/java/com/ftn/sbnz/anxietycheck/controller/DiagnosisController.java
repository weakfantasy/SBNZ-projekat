package com.ftn.sbnz.anxietycheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.sbnz.anxietycheck.service.DiagnosisService;

@RestController
@RequestMapping(value = "/diagnosis", produces = MediaType.APPLICATION_JSON_VALUE)
public class DiagnosisController {
	
	@Autowired
	private DiagnosisService dignosisService;
	
	
	
}