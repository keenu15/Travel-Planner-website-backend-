package com.java.cognizant.bp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Itinerary_info")
public class Itinerary_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Itinerary_id")
	private long Itinerary_id;
	@Column(name = "Email_id")
	private String Email_id;
	@Column(name = "Itinerary_name")
	private String Itinerary_name;
	@Column(name = "Information",columnDefinition = "TEXT")
	private String Information;
	
	public long getItinerary_id() {
		return Itinerary_id;
	}
	
	public void setItinerary_id(long itinerary_id) {
		this.Itinerary_id = itinerary_id;
	}
	
	public String getEmail_id() {
		return Email_id;
	}
	
	public void setEmail_id(String Email_id) {
		this.Email_id = Email_id;
	}
	
	public String getItinerary_name() {
		return Itinerary_name;
	}
	
	public void setItinerary_name(String itinerary_name) {
		this.Itinerary_name = itinerary_name;
	}
	
	public String getInformation() {
		return Information;
	}
	
	public void setInformation(String information) {
		this.Information = information;
	}
	
	public Itinerary_info() {
		super();
	}
	
	public Itinerary_info(long itinerary_id, String Email_id, String itinerary_name, String information) {
		super();
		this.Itinerary_id = itinerary_id;
		this.Email_id = Email_id;
		this.Itinerary_name = itinerary_name;
		this.Information = information;
	}

	@Override
	public String toString() {
		return "Itinerary_info [Itinerary_id=" + Itinerary_id + ", Email_id=" + Email_id + ", Itinerary_name="
				+ Itinerary_name + ", Information=" + Information + "]";
	}
		
}
