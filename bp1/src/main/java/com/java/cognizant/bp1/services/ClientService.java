package com.java.cognizant.bp1.services;

import java.util.List;

import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Itinerary_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.NotFoundException;

public interface ClientService {
		
	public List<Fact_info> searchFactsByPlace(String place_name) throws NotFoundException;

	public List<Fact_info> searchPlaceByFood(String food) throws NotFoundException;
	
	public List<Hotel_info> searchHotelsByType(String Hotel_type) throws NotFoundException;
	
	public List<Hotel_info> searchHotelsByPrice(int price) throws NotFoundException;
	
	public Itinerary_info addItinerary(Itinerary_info itinerary);

	public List<Itinerary_info> getItinerary() throws NotFoundException;
	
	public List<Place_info> searchPlacesByName(String place_name) throws NotFoundException;
	
	public List<Place_info> searchPlacesByTerrain(String place_terrain) throws NotFoundException;
	
	public List<Place_info> searchPlacesByType(String place_type) throws NotFoundException;

	public Fact_info addFact(Fact_info fact);

	List<Hotel_info> searchHotelsByplacename(String Place_name) throws NotFoundException;


}
