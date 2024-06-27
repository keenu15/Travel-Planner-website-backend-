package com.java.cognizant.bp1.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Place_info", schema = "BP1")
public class Place_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Place_id")
	private long Place_id;
	@Column(name="Place_name")
	private String Place_name;
	@Column(name="Place_type")
	private String Place_type;
	@Column(name = "Place_terrain")
	private String Place_terrain;
	
	public long getPlace_id() {
		return Place_id;
	}
	
	public void setPlace_id(long place_id) {
		this.Place_id = place_id;
	}
	
	public String getPlace_name() {
		return Place_name;
	}
	
	public void setPlace_name(String place_name) {
		this.Place_name = place_name;
	}
	
	public String getPlace_type() {
		return Place_type;
	}
	
	public void setPlace_type(String place_type) {
		this.Place_type = place_type;
	}
	
	public String getPlace_terrain() {
		return Place_terrain;
	}
	
	public void setPlace_terrain(String place_terrain) {
		this.Place_terrain = place_terrain;
	}

	public Place_info() {
		super();
	}

	public Place_info(long place_id, String place_name, String place_type, String place_terrain) {
		super();
		this.Place_id = place_id;
		this.Place_name = place_name;
		this.Place_type = place_type;
		this.Place_terrain = place_terrain;
	}

	@Override
	public String toString() {
		return "Place_info [Place_id=" + Place_id + ", Place_name=" + Place_name + ", Place_type=" + Place_type
				+ ", Place_terrain=" + Place_terrain + "]";
	}
	
}
