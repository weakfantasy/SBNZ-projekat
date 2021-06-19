package com.ftn.sbnz.anxietycheck.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.sbnz.anxietycheck.dto.DiagnosisResponseDTO;
import com.ftn.sbnz.anxietycheck.dto.TestTakerDTO;
import com.ftn.sbnz.anxietycheck.dto.TestTakerResponseDTO;
import com.ftn.sbnz.anxietycheck.model.CommonAnxietySymptoms;
import com.ftn.sbnz.anxietycheck.model.Diagnosis;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;
import com.ftn.sbnz.anxietycheck.service.TestTakingUserService;
import com.ftn.sbnz.anxietycheck.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestTakerController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TestTakingUserService testTakingUserService;
	
	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
    public ResponseEntity<?> testFunction(@PathVariable("email") String email) {
		System.out.println("Tuj sam");
		TestTakingUser user = new TestTakingUser();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
	@RequestMapping(value = "diagnoses/{email}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllDiagnoses(@PathVariable("email") String email) {
		TestTakingUser user = new TestTakingUser();
		user = testTakingUserService.findByEmail(email);
		List<DiagnosisResponseDTO> list = new ArrayList<DiagnosisResponseDTO>();
		for(Diagnosis d : user.getDiagnosis()) {
			DiagnosisResponseDTO dto = new DiagnosisResponseDTO(d);
			list.add(dto);
		}
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
	
	@RequestMapping(value = "check/{email}", method = RequestMethod.PUT)
    public ResponseEntity<?> getStressLevel(@RequestBody TestTakerDTO testTakerDto, @PathVariable("email") String email) {
		TestTakingUser user = new TestTakingUser();
		user = testTakingUserService.findByEmail(email);

		for(CommonAnxietySymptoms t : testTakerDto.getCommonSympotms()) {
			System.out.println("(Kontroler) Simptomi: " + t.toString());
		}
	
		user.setCommonSymptoms(testTakerDto.getCommonSympotms());

		user.setDepressionSymptoms(testTakerDto.getDepressionSymptoms());
	
		user.setPredominantSymptoms(testTakerDto.getPredominantSymptoms());
		
		user.setStart(testTakerDto.getStart());
		user.setStressPoints(testTakerDto.getStressPoints());
		user.setRiskFactors(testTakerDto.getRiskFactors());
		
		testTakingUserService.save(user);
		
		userService.getStressLevel(user);
		
		user = testTakingUserService.findByEmail(email);
		
        return new ResponseEntity<>(new TestTakerResponseDTO(user),HttpStatus.OK);
    }

	
	
	
	
	
}
