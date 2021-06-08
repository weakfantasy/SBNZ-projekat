package com.ftn.sbnz.anxietycheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.sbnz.anxietycheck.model.Depression;

@Repository
public interface DepressionRepository extends JpaRepository<Depression, Long> {
	
	public List<Depression> findAll();
	

}
