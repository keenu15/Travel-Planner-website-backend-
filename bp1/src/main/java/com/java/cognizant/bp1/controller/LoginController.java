package com.java.cognizant.bp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.cognizant.bp1.entities.Login_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.LoginException;
import com.java.cognizant.bp1.functions.ClientServiceImpl;
import com.java.cognizant.bp1.services.LoginService;



@RestController
@RequestMapping("/loginoperations")
@CrossOrigin(origins = "*")
public class LoginController{
	
	@Autowired
	ClientServiceImpl clientService;
	
	@Autowired
	private LoginService loginService;
	
	
	@GetMapping("/logininfo")
    public ResponseEntity<List<Login_info>> getAllLogin() {
        try {
            List<Login_info> login = loginService.getLogin();
            return ResponseEntity.ok(login);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
	
	@PostMapping("/registerinfo")
	public Login_info addRegister(@RequestBody Login_info register){
	return loginService.addRegister(register);
	}
	
	@DeleteMapping("/deletelogin/{clientId}")
    public ResponseEntity<String> deleteLoginByClientId(@PathVariable("clientId") Long clientId) {
        try {
            loginService.deleteLoginByClientId(clientId);
            return ResponseEntity.ok("Client deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete client");
        }
    }
}
