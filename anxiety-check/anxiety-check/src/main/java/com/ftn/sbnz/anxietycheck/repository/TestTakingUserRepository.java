package com.ftn.sbnz.anxietycheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

@Repository
public interface TestTakingUserRepository extends JpaRepository<TestTakingUser, Long>{
	
	TestTakingUser findOneByEmail(String email);
	
	

}
