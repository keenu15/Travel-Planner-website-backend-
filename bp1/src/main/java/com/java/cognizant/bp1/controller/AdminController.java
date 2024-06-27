package com.java.cognizant.bp1.controller;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.cognizant.bp1.entities.Client_info;
import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Place_info;

import com.java.cognizant.bp1.exception.NotFoundException;
import com.java.cognizant.bp1.functions.AdminServiceImpl;
import com.java.cognizant.bp1.services.AdminService;


@RestController
@RequestMapping("/adminoperations")
@CrossOrigin(origins = "*")
public class AdminController {
	
	Log Logger  = LogFactory.getLog(AdminController.class);
	
	@Autowired
	AdminService adminService;
	
	//client
	@GetMapping("/getclientinfo")
	public ResponseEntity<List<Client_info>> getClient() throws NotFoundException{
		//return new ResponseEntity<List<?>>(adminService.getClient(),HttpStatus.FOUND);
		try {
            List<Client_info> clients = adminService.getClient();
            return ResponseEntity.ok(clients);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
	}
	
	@PostMapping("/clientinfo")
	public Client_info addClient(@RequestBody Client_info client) {
		return adminService.addClient(client);
	}
	
	//fact
	@GetMapping("/getfactinfo")
	public ResponseEntity<List<Fact_info>> getFact() throws NotFoundException{
		//return new ResponseEntity<List<?>>(adminService.getFact(),HttpStatus.FOUND);
		try {
            List<Fact_info> facts = adminService.getFact();
            return ResponseEntity.ok(facts);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
	}
	
	@PostMapping("/factinfo")
	public Fact_info addFact(@RequestBody Fact_info fact) {
		return adminService.addFact(fact);
	}
	
	//hotel
	@GetMapping("/gethotelinfo")
	public ResponseEntity<List<Hotel_info>>  getHotel() throws NotFoundException{
//		return new ResponseEntity<List<Hotel_info>>(adminService.getHotel(),HttpStatus.FOUND);
		try {
            List<Hotel_info> hotels = adminService.getHotel();
            return ResponseEntity.ok(hotels);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
	}
	
	@PostMapping("/hotelinfo")
	public Hotel_info addHotel(@RequestBody Hotel_info hotel){
		return adminService.addHotel(hotel);
	}
	
	//place
//	@SuppressWarnings({ "rawtypes", "unchecked" })
	
//	public ResponseEntity getPlace() throws NotFoundException {
//		return new ResponseEntity(obj.getPlace(),HttpStatus.FOUND);
//	}
	
//	public  getPlace(@RequestBody Place_info place) {
//		return ResponseEntity.ok(place);
//		
//	}
	
	@GetMapping("/getplaceinfo")
    public ResponseEntity<List<Place_info>> getAllPlace() {
        try {
            List<Place_info> places = adminService.getPlace();
            return ResponseEntity.ok(places);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
	
	@PostMapping("/placeinfo")
	public Place_info addPlace(@RequestBody Place_info place){
	return adminService.addPlace(place);
	}
	
	@GetMapping("/getclientbyemail/{email_id}")
	public ResponseEntity<List<Client_info>> searchclientbyname(@PathVariable("email_id") String email_id){
		 try 
	     {
	          List<Client_info> places = adminService.searchclientbyname(email_id);
	          return ResponseEntity.ok(places);
	     } catch (Exception e) {
	    	 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	     }
    }
	
	@DeleteMapping("/deleteclient/{clientId}")
    public ResponseEntity<String> deleteClientById(@PathVariable("clientId") Long clientId) {
        try {
            adminService.deleteClientByClientId(clientId);
            return ResponseEntity.ok("Client deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete client");
        }
    }
	
	@DeleteMapping("/deleteplace/{placeId}")
    public ResponseEntity<String> deletePlaceByPlaceId(@PathVariable("placeId") Long placeId) {
        try {
            adminService.deletePlaceByPlaceId(placeId);
            return ResponseEntity.ok("Place deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete client");
        }
    }
	
	@DeleteMapping("/deletehotel/{hotelId}")
    public ResponseEntity<String> deleteHotelByHotelId(@PathVariable("hotelId") Long hotelId) {
        try {
            adminService.deleteHotelByHotelId(hotelId);
            return ResponseEntity.ok("Hotel deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete client");
        }
    }
	
	@DeleteMapping("/deletefact/{factId}")
    public ResponseEntity<String> deleteFactByFactId(@PathVariable("factId") Long factId) {
        try {
            adminService.deleteFactByFactId(factId);
            return ResponseEntity.ok("Factt deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete client");
        }
    }
}
