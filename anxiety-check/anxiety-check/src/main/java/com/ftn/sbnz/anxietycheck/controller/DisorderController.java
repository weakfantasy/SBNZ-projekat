package com.ftn.sbnz.anxietycheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.sbnz.anxietycheck.service.DisorderService;

@RestController
@RequestMapping(value = "/disorders", produces = MediaType.APPLICATION_JSON_VALUE)
public class DisorderController {
	
	@Autowired
	private DisorderService disorderService;
	
	
	
}