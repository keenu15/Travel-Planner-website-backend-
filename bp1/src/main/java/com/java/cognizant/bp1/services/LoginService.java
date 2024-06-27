package com.java.cognizant.bp1.services;

import java.util.List;

import com.java.cognizant.bp1.entities.Login_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.LoginException;

public interface LoginService {
	
	public List<Login_info> getLogin();
	
	public Login_info addRegister(Login_info register) ;

	void deleteLoginByClientId(Long clientId);
}
