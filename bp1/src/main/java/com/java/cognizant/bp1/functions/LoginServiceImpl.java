package com.java.cognizant.bp1.functions;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cognizant.bp1.entities.Login_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.LoginException;
import com.java.cognizant.bp1.repos.LoginRepo;
import com.java.cognizant.bp1.services.LoginService;

@Service(value="LoginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo loginRepo;

	@Override
	public List<Login_info> getLogin() {
		List<Login_info> login = loginRepo.findAll();
		return login;
	}

	@Override
	public Login_info addRegister(Login_info register) {
		return loginRepo.save(register);
	}
	
	@Override
	public void deleteLoginByClientId(Long clientId) {
	    loginRepo.deleteById(clientId);
	}
}
