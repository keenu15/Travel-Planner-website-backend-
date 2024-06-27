package com.java.cognizant.bp1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;


@Entity
@Table(name = "Fact_info", schema = "BP1")
public class Fact_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Fact_id")
	private long Fact_id;
	@Column(name="Place_name",columnDefinition = "TEXT")
	private String Place_name;
	@Column(name="Place_desc",columnDefinition = "TEXT")
	private String Place_desc;
	@Column(name="Food",columnDefinition = "TEXT")
	private String Food;
	@Column(name="Hotel_name",columnDefinition = "TEXT")
	private String Hotel_name;
	@Column(name="Tourist_spots",columnDefinition = "TEXT")
	private String Tourist_spots;
	@Column(name="Fun_fact",columnDefinition = "TEXT")
	private String Fun_fact;
	
	public Fact_info() {
		super();
	}

	public long getFact_id() {
		return Fact_id;
	}

	public void setPlace_name(String Place_name) {
		this.Place_name = Place_name;
	}
	
	public String getPlace_name() {
		return Place_name;
	}

	public void setFact_id(long Fact_id) {
		this.Fact_id = Fact_id;
	}

	public String getFood() {
		return Food;
	}

	public void setFood(String Food) {
		this.Food = Food;
	}

	public String getHotel_name() {
		return Hotel_name;
	}

	public void setHotel_name(String Hotel_name) {
		this.Hotel_name = Hotel_name;
	}
	
	public String getTourist_spots() {
		return Tourist_spots;
	}

	public void setTourist_spots(String Tourist_spots) {
		this.Tourist_spots = Tourist_spots;
	}
	
	public String getFun_fact() {
		return Fun_fact;
	}

	public void setFun_fact(String Fun_fact) {
		this.Fun_fact = Fun_fact;
	}
	
	public String getPlace_desc() {
		return Place_desc;
	}

	public void setPlace_desc(String Place_desc) {
		this.Place_desc = Place_desc;
	}

	public Fact_info(long Fact_id, String Place_name, String Place_desc, String food, String hotel_name, String tourist_spots,
			String fun_fact) {
		super();
		this.Fact_id = Fact_id;
		this.Place_name = Place_name;
		this.Place_desc = Place_desc;
		this.Food = food;
		this.Hotel_name = hotel_name;
		this.Tourist_spots = tourist_spots;
		this.Fun_fact = fun_fact;
	}

	@Override
	public String toString() {
		return "Fact_info [Fact_id=" + Fact_id + ", Place_name=" + Place_name + ", Place_desc=" + Place_desc + ", Food=" + Food + ", Hotel_name="
				+ Hotel_name + ", Tourist_spots=" + Tourist_spots + ", Fun_fact=" + Fun_fact + "]";
	}


}
