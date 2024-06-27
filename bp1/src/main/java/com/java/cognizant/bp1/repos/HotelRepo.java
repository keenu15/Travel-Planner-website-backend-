package com.java.cognizant.bp1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.cognizant.bp1.entities.Hotel_info;

@Repository
public interface HotelRepo extends JpaRepository<Hotel_info,Long>{

	
}
