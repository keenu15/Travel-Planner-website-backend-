package com.java.cognizant.bp1;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.java.cognizant.bp1.controller.LoginController;
import com.java.cognizant.bp1.entities.Login_info;
import com.java.cognizant.bp1.exception.LoginException;



@SpringBootApplication
public class backpackApplication implements CommandLineRunner{
	
//	private static final Log Logger = LogFactory.getLog(backpackApplication.class);
//	
//	@Autowired
//	LoginController loginController;
//	
//	@Autowired
//	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(backpackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	
//		try{
//
//			Login_info customerLogin = new Login_info();
//			customerLogin.setEmail_id("harry@gmail.com");
//			customerLogin.setPassword("harry123");
//
//			loginController.authenticateCustomer(customerLogin);
//			
//			Logger.info(environment.getProperty("SUCCESS"));
//		}catch(LoginException exception){
//			Logger.error(environment.getProperty(exception.getMessage()));
//		}
		
	}


}
