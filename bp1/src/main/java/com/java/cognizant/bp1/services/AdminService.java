package com.java.cognizant.bp1.services;

import java.util.List;

import com.java.cognizant.bp1.entities.Client_info;
import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.NotFoundException;

public interface AdminService {
	
	public Client_info addClient(Client_info client);	
	
	public List<Client_info> getClient() throws NotFoundException;
	
	public Fact_info addFact(Fact_info fact);	
	
	public List<Fact_info> getFact() throws NotFoundException;
	
	public Hotel_info addHotel(Hotel_info hotel);	
	
	public List<Hotel_info> getHotel() throws NotFoundException;
	
	public Place_info addPlace(Place_info place) ;	
	
	//public List<Place_info> getPlace() throws NotFoundException;
	
	public List<Place_info> getPlace();

	public List<Client_info> searchclientbyname(String email_id) throws NotFoundException;

	void deleteClientByClientId(Long clientId);

	void deletePlaceByPlaceId(Long placeId);

	void deleteFactByFactId(Long factId);

	void deleteHotelByHotelId(Long hotelId);

}
