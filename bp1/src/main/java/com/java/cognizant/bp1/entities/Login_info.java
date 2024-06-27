package com.java.cognizant.bp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Login_info {
	@Id
	@Column(name = "Login_id")
	private int Login_id;
	@Column(name = "Email_id")
	private String Email_id;
	@Column(name = "Password")
	private String Password;
	@Column(name = "Client_name")
	String Client_name;
	
	public int getLogin_id() {
		return Login_id;
	}
	
	public void setLogin_id(int login_id) {
		this.Login_id = login_id;
	}
	
	public String getEmail_id() {
		return Email_id;
	}
	
	public void setEmail_id(String email_id) {
		this.Email_id = email_id;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getClient_name() {
		return Client_name;
	}

	public void setClient_name(String client_name) {
		this.Client_name = client_name;
	}
	
	public Login_info() {
		super();
	}

	public Login_info(int login_id,String Client_name,String email_id, String password, String user_type) {
		super();
		this.Login_id = login_id;
		this.Email_id = email_id;
		this.Password = password;
		this.Client_name = Client_name;

	}

	@Override
	public String toString() {
		return "Login_info [Login_id=" + Login_id + ", Email_id=" + Email_id + ", Password=" + Password 
				+ ", Client_name=" + Client_name + "]";
	}
	
	
	
}
