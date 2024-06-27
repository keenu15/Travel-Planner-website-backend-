
package com.java.cognizant.bp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Client_info {
	@Id
	@Column(name = "Client_id")
	long Client_id;
	@Column(name = "Client_name")
	String Client_name;
	@Column(name = "Email_id")
	String Email_id;

	public long getClient_id() {
		return Client_id;
	}

	public void setClient_id(long client_id) {
		this.Client_id = client_id;
	}

	public String getClient_name() {
		return Client_name;
	}

	public void setClient_name(String client_name) {
		this.Client_name = client_name;
	}
	
	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		this.Email_id = email_id;
	}



	public Client_info() {
		super();
	}
	
	public Client_info(long client_id, String client_name, String email_id) {
		super();
		this.Client_id = client_id;
		this.Client_name = client_name;
		this.Email_id = email_id;
	}

	@Override
	public String toString() {
		return "Client_info [Client_id=" + Client_id + ", Client_name=" + Client_name + ", Email_id=" + Email_id
				+ "]";
	}
	

}
