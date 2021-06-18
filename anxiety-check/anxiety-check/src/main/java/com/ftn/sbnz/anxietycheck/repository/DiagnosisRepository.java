package com.ftn.sbnz.anxietycheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.sbnz.anxietycheck.model.Diagnosis;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
	
	Diagnosis findOneByName(String name);
	List<Diagnosis> findAll(); 

}
