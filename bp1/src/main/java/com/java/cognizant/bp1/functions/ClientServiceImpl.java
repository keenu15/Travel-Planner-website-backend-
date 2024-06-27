package com.java.cognizant.bp1.functions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Itinerary_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.NotFoundException;
import com.java.cognizant.bp1.repos.FactRepo;
import com.java.cognizant.bp1.repos.HotelRepo;
import com.java.cognizant.bp1.repos.ItineraryRepo;
import com.java.cognizant.bp1.repos.PlaceRepo;
import com.java.cognizant.bp1.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	FactRepo factRepo;
	@Autowired
	HotelRepo hotelRepo;
	@Autowired
	ItineraryRepo itineraryRepo;
	@Autowired
	PlaceRepo placeRepo;
	
	
	@Override
	public Fact_info addFact(Fact_info fact){
			return factRepo.save(fact);
	}
	
	@Override
	public List<Fact_info> searchFactsByPlace(String place_name) throws NotFoundException {
		 List<Fact_info> places = new ArrayList<Fact_info>();
	        
	        List<Fact_info> pus = factRepo.findAll();
			pus.forEach(k -> {
				if (k.getPlace_name().equalsIgnoreCase(place_name)){
					places.add(k);
				}
			});
			return places;
	}
		
	@Override
	public List<Fact_info> searchPlaceByFood(String food) throws NotFoundException {
		 List<Fact_info> places = new ArrayList<Fact_info>();
	        
	        List<Fact_info> pa = factRepo.findAll();
			pa.forEach(k -> {
				if (k.getFood().equalsIgnoreCase(food)) {
					places.add(k);
				}
			});
			return places;
	}

	@Override
	public List<Hotel_info> searchHotelsByType(String Hotel_type) throws NotFoundException{
		 List<Hotel_info> places = new ArrayList<Hotel_info>();
	        
	        List<Hotel_info> spi = hotelRepo.findAll();
			spi.forEach(k -> {
				if (k.getHotel_type().equalsIgnoreCase(Hotel_type)) {
					places.add(k);
				}
			});
			return places;
	}
	
	@Override
	public List<Hotel_info> searchHotelsByplacename(String Place_name) throws NotFoundException{
		 List<Hotel_info> places = new ArrayList<Hotel_info>();
	        
	        List<Hotel_info> mit = hotelRepo.findAll();
			mit.forEach(k -> {
				if (k.getPlace_name().equalsIgnoreCase(Place_name)) {
					places.add(k);
				}
			});
			return places;
	}
	
	@Override
	public List<Hotel_info> searchHotelsByPrice(int price) throws NotFoundException{
		List<Hotel_info> places = new ArrayList<Hotel_info>();
        
        List<Hotel_info> der = hotelRepo.findAll();
		der.forEach(k -> {
			if (k.getPrice()<=price) {
				places.add(k);
			}
		});
		return places;
	}

	@Override
	public Itinerary_info addItinerary(Itinerary_info itinerary) {
		return itineraryRepo.save(itinerary);
	}

	@Override
	public List<Itinerary_info> getItinerary() {
		return itineraryRepo.findAll();
	}

	@Override
	public List<Place_info> searchPlacesByName(String place_name) throws NotFoundException{
		 List<Place_info> places = new ArrayList<Place_info>();
	        
	        List<Place_info> man = placeRepo.findAll();
			man.forEach(k -> {
				if (k.getPlace_name().equalsIgnoreCase(place_name)) {
					places.add(k);
				}
			});
			return places;
	}
	
	@Override
	public List<Place_info> searchPlacesByTerrain(String place_terrain) throws NotFoundException{
		 List<Place_info> places = new ArrayList<Place_info>();
	        
	        List<Place_info> heat = placeRepo.findAll();
			heat.forEach(k -> {
				if (k.getPlace_terrain().equalsIgnoreCase(place_terrain)) {
					places.add(k);
				}
			});
			return places;
	}
	
	@Override
	public List<Place_info> searchPlacesByType(String place_type) throws NotFoundException{
		 List<Place_info> places = new ArrayList<Place_info>();
	        
	        List<Place_info> blast = placeRepo.findAll();
			blast.forEach(k -> {
				if (k.getPlace_type().equalsIgnoreCase(place_type)) {
					places.add(k);
				}
			});
			if(places.isEmpty()) {
				throw new NotFoundException();
			}
			return places;
	}

	
	

}
