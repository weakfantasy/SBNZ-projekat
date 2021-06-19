package com.ftn.sbnz.anxietycheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.sbnz.anxietycheck.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findOneByEmail(String email);
	
}
