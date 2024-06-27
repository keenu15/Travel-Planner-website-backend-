package com.java.cognizant.bp1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.cognizant.bp1.entities.Login_info;
import com.java.cognizant.bp1.entities.Place_info;

public interface LoginRepo extends JpaRepository<Login_info, Long> {

}
