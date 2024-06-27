package com.java.cognizant.bp1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.cognizant.bp1.entities.Client_info;

@Repository
public interface ClientRepo extends JpaRepository<Client_info, Long> {
	

}
