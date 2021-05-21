package com.ftn.sbnz.anxietycheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.sbnz.anxietycheck.dto.TestTakerDTO;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;
import com.ftn.sbnz.anxietycheck.service.UserService;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestTakerController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/stressLevel", method = RequestMethod.GET)
    public ResponseEntity<?> getStressLevel(@RequestBody TestTakerDTO testTakerDto) {
		
		TestTakingUser user = new TestTakingUser(testTakerDto);
		
		userService.getStressLevel(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

	
	
	
	
	
}
