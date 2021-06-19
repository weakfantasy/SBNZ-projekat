package com.ftn.sbnz.anxietycheck.service;

import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

public interface TestTakingUserService {
	
	TestTakingUser findByEmail(String email);
	void save(TestTakingUser user);
	void remove(TestTakingUser user);

}
