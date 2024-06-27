package com.java.cognizant.bp1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.cognizant.bp1.entities.Place_info;

@Repository
public interface PlaceRepo extends JpaRepository<Place_info, Long> {
		
}
