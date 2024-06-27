package com.java.cognizant.bp1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.cognizant.bp1.entities.Fact_info;

@Repository
public interface FactRepo extends JpaRepository<Fact_info, Long> {
	
}
