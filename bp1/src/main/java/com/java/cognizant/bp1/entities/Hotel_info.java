package com.java.cognizant.bp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Hotel_id")
	private long Hotel_id;
	@Column(name = "Place_name")
	private String Place_name;
	@Column(name = "Hotel_name")
	private String Hotel_name;
	@Column(name = "Hotel_desc",columnDefinition = "TEXT")
	private String Hotel_desc;
	@Column(name = "Hotel_type")
	private String Hotel_type;
	@Column(name = "Hotel_number")
	private long Hotel_number;
	@Column(name = "Price_per_night")
	private long Price;
	
	public Hotel_info() {
		super();
	}

	public Hotel_info(long hotel_id, String Place_name, String hotel_name,String hotel_desc,String hotel_type, long hotel_number,
			long Price) {
		super();
		this.Hotel_id = hotel_id;
		this.Place_name = Place_name;
		this.Hotel_name = hotel_name;
		this.Hotel_desc = hotel_desc;
		this.Hotel_type = hotel_type;
		this.Hotel_number = hotel_number;
		this.Price = Price;
	}

	public long getHotel_id() {
		return Hotel_id;
	}

	public void setHotel_id(long hotel_id) {
		this.Hotel_id = hotel_id;
	}

	public String getPlace_name() {
		return Place_name;
	}

	public void setPlace_name(String Place_name) {
		this.Place_name = Place_name;
	}

	public String getHotel_type() {
		return Hotel_type;
	}

	public void setHotel_type(String hotel_type) {
		this.Hotel_type = hotel_type;
	}

	public long getHotel_number() {
		return Hotel_number;
	}

	public void setHotel_number(long hotel_number) {
		this.Hotel_number = hotel_number;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long Price) {
		this.Price = Price;
	}
	
	public String getHotel_name() {
		return Hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.Hotel_name = hotel_name;
	}
	
	public String getHotel_desc() {
		return Hotel_desc;
	}

	public void setHotel_desc(String hotel_desc) {
		this.Hotel_desc = hotel_desc;
	}
	
	@Override
	public String toString() {
		return "Hotel_info [Hotel_id=" + Hotel_id + ", Place_name=" + Place_name + ", Hotel_name=" + Hotel_name
				+ ", Hotel_desc=" + Hotel_desc + ", Hotel_type=" + Hotel_type + ", Hotel_number=" + Hotel_number + ", Price_per_night="
				+ Price + "]";
	}
	
}
