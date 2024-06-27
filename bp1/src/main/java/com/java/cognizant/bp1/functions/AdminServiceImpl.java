package com.java.cognizant.bp1.functions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cognizant.bp1.entities.Client_info;
import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.NotFoundException;
import com.java.cognizant.bp1.repos.ClientRepo;
import com.java.cognizant.bp1.repos.FactRepo;
import com.java.cognizant.bp1.repos.HotelRepo;
import com.java.cognizant.bp1.repos.PlaceRepo;
import com.java.cognizant.bp1.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	ClientRepo clientRepo;
	@Autowired
	FactRepo factRepo;
	@Autowired
	HotelRepo hotelRepo;
	@Autowired
	PlaceRepo placeRepo;
	
	
	
	@Override
	public Client_info addClient(Client_info client){
		return clientRepo.save(client);
	}

	@Override
	public List<Client_info> getClient() throws NotFoundException {
		
		if(clientRepo.findAll().isEmpty()) {
			throw new NotFoundException();
		}
		
		return clientRepo.findAll();
	}

	@Override
	public Fact_info addFact(Fact_info fact){
			return factRepo.save(fact);
	}

	@Override
	public List<Fact_info> getFact() throws NotFoundException {
		
		if(factRepo.findAll().isEmpty()) {
			throw new NotFoundException();
		}
		
		return factRepo.findAll();
	}

	@Override
	public Hotel_info addHotel(Hotel_info hotel){
		return hotelRepo.save(hotel);
		
	}

	@Override
	public List<Hotel_info> getHotel() throws NotFoundException{
	
		if(hotelRepo.findAll().isEmpty()) {
			throw new NotFoundException();
		}
		return hotelRepo.findAll();
	}

	@Override
	public Place_info addPlace(Place_info place){
		return placeRepo.save(place);
	}

//	@Override
//	public List<Place_info> getPlace() throws NotFoundException {
//		
//		if(placeRepo.findAll().isEmpty()) {
//			throw new NotFoundException();
//		}
//		
//		return placeRepo.findAll();
//	}
	
	@Override
	public List<Place_info> getPlace() {
		 List<Place_info> places = placeRepo.findAll();
	     return places;

	}

	@Override
	public List<Client_info> searchclientbyname(String email_id) throws NotFoundException {
		List<Client_info> emails = new ArrayList<Client_info>();
        
        List<Client_info> blast = clientRepo.findAll();
		blast.forEach(k -> {
			if (k.getEmail_id().equalsIgnoreCase(email_id)) {
				emails.add(k);
			}
		});
		if(emails.isEmpty()) {
			throw new NotFoundException();
		}
		return emails;
	}
	
	@Override
	public void deleteClientByClientId(Long clientId) {
	    clientRepo.deleteById(clientId);
	}

	@Override
	public void deletePlaceByPlaceId(Long placeId) {
	    placeRepo.deleteById(placeId);
	}
	
	@Override
	public void deleteFactByFactId(Long factId) {
	    factRepo.deleteById(factId);
	}
	
	@Override
	public void deleteHotelByHotelId(Long hotelId) {
	    hotelRepo.deleteById(hotelId);
	}
}
