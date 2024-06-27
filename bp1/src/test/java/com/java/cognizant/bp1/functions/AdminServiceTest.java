package com.java.cognizant.bp1.functions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.java.cognizant.bp1.entities.Client_info;
import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.NotFoundException;
import com.java.cognizant.bp1.repos.ClientRepo;
import com.java.cognizant.bp1.repos.FactRepo;
import com.java.cognizant.bp1.repos.HotelRepo;
import com.java.cognizant.bp1.repos.PlaceRepo;


@WebMvcTest(ClientRepo.class)
public class AdminServiceTest {
	
	
	@Mock
	private ClientRepo clientRepo;
	
	@Mock
	private FactRepo factRepo;
	
	@Mock
	private HotelRepo hotelRepo;
	
	@Mock
	private PlaceRepo placeRepo;

	@InjectMocks
	private AdminServiceImpl service;

	@Test
	public void addClient() {
		
		Client_info client = new Client_info(1,"kamal","asas@gmail.com");
		 service.addClient(client);
		verify(clientRepo,times(1)).save(client);
		
	}
	
	@Test
	public void addFact() {
		
		Fact_info fact = new Fact_info();
		fact.setFact_id(1L);
		fact.setPlace_name("kamal");
		fact.setFood("asas");
		fact.setHotel_name("small@gmail.com");
		fact.setTourist_spots("gh");
		fact.setFun_fact("sas");
		service.addFact(fact);
		verify(factRepo,times(1)).save(fact);
		
	}
	
	@Test
	public void addHotel() {
		
		Hotel_info hotel = new Hotel_info();
		hotel.setHotel_id(1L);
		hotel.setPlace_name("kamal");
		hotel.setHotel_name("asas");
		hotel.setHotel_name("small@gmail.com");
		hotel.setHotel_type("gh");
		hotel.setHotel_number(994005567);
		hotel.setPrice(2500);
		service.addHotel(hotel);
		verify(hotelRepo,times(1)).save(hotel);
		
	}
	
	@Test
	public void addPlace() {
		
		Place_info place = new Place_info();
		place.setPlace_id(1L);
		place.setPlace_name("kamal");
		place.setPlace_type("asas");
		place.setPlace_terrain("small@gmail.com");
		service.addPlace(place);
		verify(placeRepo,times(1)).save(place);
		
	}
	
	@Test
    public void addClient_failure() {
        Client_info client = new Client_info(1, "kamal", "asas@gmail.com");
        
        // Simulate a failure scenario
        when(clientRepo.save(client)).thenThrow(new RuntimeException("Failed to add client"));

        // Call the method that adds a client
        assertThrows(RuntimeException.class, () -> service.addClient(client));
        
        // Verify that the save method is called once
        verify(clientRepo, times(1)).save(client);
    }
    
    @Test
    public void addFact_failure() {
        Fact_info fact = new Fact_info();
        when(factRepo.save(fact)).thenThrow(new RuntimeException("Failed to add fact"));
        assertThrows(RuntimeException.class, () -> service.addFact(fact));
        verify(factRepo, times(1)).save(fact);
    }
    
    @Test
    public void addHotel_failure() {
        Hotel_info hotel = new Hotel_info();
        when(hotelRepo.save(hotel)).thenThrow(new RuntimeException("Failed to add hotel"));
        assertThrows(RuntimeException.class, () -> service.addHotel(hotel));
        verify(hotelRepo, times(1)).save(hotel);
    }
    
    @Test
    public void addPlace_failure() {
        Place_info place = new Place_info();
        when(placeRepo.save(place)).thenThrow(new RuntimeException("Failed to add place"));
        assertThrows(RuntimeException.class, () -> service.addPlace(place));        
        verify(placeRepo, times(1)).save(place);
    }

    @Test
    public void testSearchclientbyname() throws NotFoundException {
		String email = "gtr@gmail.com";
        List<Client_info> clients = new ArrayList<>();
        clients.add(new Client_info(1L,"Dhanush","gtr@gmail.com"));
        when(clientRepo.findAll()).thenReturn(clients);
        
        List<Client_info> fact = service.searchclientbyname(email);
        assertEquals(1, fact.size());
        assertEquals("gtr@gmail.com", fact.get(0).getEmail_id());
    }








}