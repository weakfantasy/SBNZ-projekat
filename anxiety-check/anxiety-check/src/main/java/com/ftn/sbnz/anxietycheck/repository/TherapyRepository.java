package com.ftn.sbnz.anxietycheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.sbnz.anxietycheck.model.Therapy;

public interface TherapyRepository extends JpaRepository<Therapy, Long>{

	List<Therapy> findAll();
	Therapy findOneByName(String name);
}
