package com.ftn.sbnz.anxietycheck.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.sbnz.anxietycheck.model.TestTakingUser;
import com.ftn.sbnz.anxietycheck.repository.TestTakingUserRepository;
import com.ftn.sbnz.anxietycheck.service.TestTakingUserService;

@Service
public class TestTakingUserServiceImpl implements TestTakingUserService{
	
	@Autowired
	TestTakingUserRepository ttuRepository;

	@Override
	public TestTakingUser findByEmail(String email) {

		return ttuRepository.findOneByEmail(email);
	}

	@Override
	public void save(TestTakingUser user) {
		ttuRepository.save(user);
		
	}

	@Override
	public void remove(TestTakingUser user) {
		ttuRepository.delete(user);
		
	}


}
