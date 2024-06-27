package com.java.cognizant.bp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Itinerary_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.functions.ClientServiceImpl;


@RestController
@RequestMapping("/clientoperations")
@CrossOrigin(origins = "*")
public class ClientController {
	
	@Autowired
	ClientServiceImpl clientService;
	
	@GetMapping("/searchfactbyplace/{place_name}")
	public ResponseEntity<List<Fact_info>> searchFactsByPlace(@PathVariable("place_name") String place_name){
		 try 
	     {
	          List<Fact_info> places = clientService.searchFactsByPlace(place_name);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	    	 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	     }
    }
	
	@GetMapping("/searchplacebyfood/{food}")
	public ResponseEntity<List<Fact_info>> searchPlaceByFood(@PathVariable("food") String food){
		 try 
	     {
	          List<Fact_info> places = clientService.searchFactsByPlace(food);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	    	 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	     }
    }
	
	@GetMapping("/searchhotelbyplace/{place_name}")
	public ResponseEntity<List<Hotel_info>> searchHotelsByplacename(@PathVariable("place_name") String place_name){
		 try 
	     {
	          List<Hotel_info> hotels = clientService.searchHotelsByplacename(place_name);
	          return ResponseEntity.ok(hotels);
	     } catch (Exception e) {
	    	 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	     }
    }
	
	//hotel
	@GetMapping("/searchhotelbytype/{hotel_type}")
	public ResponseEntity<List<Hotel_info>> searchHotelsByType(@PathVariable("hotel_type") String hotel_type){
		 try 
	     {
	          List<Hotel_info> places = clientService.searchHotelsByType(hotel_type);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
         }	
	}
	
	@GetMapping("/searchhotelbyprice/{price}")
	public ResponseEntity<List<Hotel_info>> searchHotelsByPrice(@PathVariable("price") int price){
		 try 
	     {
	          List<Hotel_info> places = clientService.searchHotelsByPrice(price);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
         }	
	}
	
	//itinerary
	@GetMapping("/getitineraryinfo")
	public List<Itinerary_info> getItinerary(){
		return clientService.getItinerary();
	}
	
	@PostMapping("/itineraryinfo")
	public Itinerary_info addItinerary(@RequestBody Itinerary_info itinerary){
	return clientService.addItinerary(itinerary);
	}
	
	//place
	@GetMapping("/searchplacebyname/{place_name}")
	public ResponseEntity<List<Place_info>> searchPlacesByName(@PathVariable("place_name") String place_name){
		 try 
	     {
	          List<Place_info> places = clientService.searchPlacesByName(place_name);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
         }	
	}	
		 
	 @GetMapping("/searchplacebytype/{place_type}")
			public ResponseEntity<List<Place_info>> searchPlacesByType(@PathVariable("place_type") String place_type){
				 try 
			     {
			          List<Place_info> places = clientService.searchPlacesByType(place_type);
			          return ResponseEntity.ok(places);
			     } catch (Exception e) {
			    	 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			     }
		    }	
				 
     @GetMapping("/searchplacebyterrain/{place_terrain}")
     public ResponseEntity<List<Place_info>> searchPlacesByTerrain(@PathVariable("place_terrain") String place_terrain){
		 try 
	     {
	          List<Place_info> places = clientService.searchPlacesByTerrain(place_terrain);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
         }	 
	}
     
}
