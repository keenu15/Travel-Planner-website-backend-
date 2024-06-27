package com.java.cognizant.bp1.functions;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.java.cognizant.bp1.entities.Fact_info;
import com.java.cognizant.bp1.entities.Hotel_info;
import com.java.cognizant.bp1.entities.Itinerary_info;
import com.java.cognizant.bp1.entities.Place_info;
import com.java.cognizant.bp1.exception.NotFoundException;
import com.java.cognizant.bp1.repos.ClientRepo;
import com.java.cognizant.bp1.repos.FactRepo;
import com.java.cognizant.bp1.repos.HotelRepo;
import com.java.cognizant.bp1.repos.ItineraryRepo;
import com.java.cognizant.bp1.repos.PlaceRepo;


@WebMvcTest(ClientRepo.class)
public class ClientServiceTest {
	
	
	@Mock
	private ItineraryRepo itineraryRepo;
	
	@Mock
	private FactRepo factRepo;
	
	@Mock
	private HotelRepo hotelRepo;
	
	@Mock
	private PlaceRepo placeRepo;

	@InjectMocks
	private ClientServiceImpl clientService;
	
	@Test
	public void AddItinerary() {
		
    	Itinerary_info testItinerary = new Itinerary_info();
		testItinerary.setEmail_id("email@gmail.com");
		testItinerary.setItinerary_name("Test Itinerary");
		testItinerary.setInformation("Test Information");
		clientService.addItinerary(testItinerary);
		verify(itineraryRepo,times(1)).save(testItinerary);
		
	}
	
	@Test
    public void getItinerary() throws NotFoundException {
        List<Itinerary_info> itineraries = new ArrayList<>();
        itineraries.add(new Itinerary_info(1,"email@gmail.com","Agra","Visit Taj Mahal"));
        itineraries.add(new Itinerary_info(2,"email@gmail.com","Srivilliputhur","Visit Andal Temple"));
        when(itineraryRepo.findAll()).thenReturn(itineraries);
        
        List<Itinerary_info> itinerary = clientService.getItinerary();
        assertEquals(2, itinerary.size());
        assertEquals("Agra", itinerary.get(0).getItinerary_name());
        assertEquals("Srivilliputhur", itinerary.get(1).getItinerary_name());
    }
	
	@Test
    public void testSearchFactsByPlace() throws NotFoundException {
		String placeName = "Madurai";
        List<Fact_info> facts = new ArrayList<>();
        facts.add(new Fact_info(1L,"Madurai","nice place","Kari dosa","Taj","Meenakshi Temple","Land of Paandavas"));
        when(factRepo.findAll()).thenReturn(facts);
        
        List<Fact_info> fact = clientService.searchFactsByPlace(placeName);
        assertEquals(1, fact.size());
        assertEquals("Madurai", fact.get(0).getPlace_name());
    }
	
	@Test
    public void testSearchPlaceByFood() throws NotFoundException {
        String Food = "Kari dosa";
        List<Fact_info> places = new ArrayList<>();
        places.add(new Fact_info(1L,"Madurai","nice place","Kari dosa","Taj","Meenakshi Temple","Land of Paandavas"));
        when(factRepo.findAll()).thenReturn(places);
        
        List<Fact_info> result = clientService.searchPlaceByFood(Food);
        assertEquals(1, result.size());
        assertEquals("Madurai", result.get(0).getPlace_name());
    }
	
	@Test
    public void testSearchHotelsByType() throws NotFoundException {
        String Hotel_type = "5 star";
        List<Hotel_info> hotels = new ArrayList<>();
        hotels.add(new Hotel_info(1L,"Madurai","Taj","luxury hotel","5 star",987968959,100000));
        when(hotelRepo.findAll()).thenReturn(hotels);
        
        List<Hotel_info> result = clientService.searchHotelsByType(Hotel_type);
        assertEquals(1, result.size());
        assertEquals("5 star", result.get(0).getHotel_type());
    }
    
	@Test
    public void testSearchHotelsByPlacename() throws NotFoundException {
        String Place_name = "Madurai";
        List<Hotel_info> hotels = new ArrayList<>();
        hotels.add(new Hotel_info(1L,"Madurai","Taj","luxury hotel","5 star",987968959,100000));
        when(hotelRepo.findAll()).thenReturn(hotels);
        
        List<Hotel_info> result = clientService.searchHotelsByplacename(Place_name);
        assertEquals(1, result.size());
        assertEquals("Madurai", result.get(0).getPlace_name());
    }
	
    @Test
    public void testSearchHotelsByPrice() throws NotFoundException {
        int Price = 10000;
        List<Hotel_info> hotels = new ArrayList<>();
        hotels.add(new Hotel_info(1L,"Madurai","Taj","luxury hotel","5 star",987968959,10000));
        when(hotelRepo.findAll()).thenReturn(hotels);
        
        List<Hotel_info> result = clientService.searchHotelsByPrice(Price);
        assertEquals(1, result.size());
        assertEquals(10000, result.get(0).getPrice());
    }
    
    @Test
    public void testSearchPlacesByName() throws NotFoundException {
        String name = "Madurai";
        List<Place_info> places = new ArrayList<>();
        places.add(new Place_info(1L,"Madurai","Historical","plains"));
        when(placeRepo.findAll()).thenReturn(places);
        
        List<Place_info> result = clientService.searchPlacesByName(name);
        assertEquals(1, result.size());
        assertEquals("Madurai", result.get(0).getPlace_name());
    }
    
    @Test
    public void testSearchPlacesByType() throws NotFoundException {
        String type = "Historical";
        List<Place_info> places = new ArrayList<>();
        places.add(new Place_info(1L,"Madurai","Historical","plains"));
        when(placeRepo.findAll()).thenReturn(places);
        
        List<Place_info> result = clientService.searchPlacesByType(type);
        assertEquals(1,result.size());
        assertEquals("Madurai", result.get(0).getPlace_name());
    }
    
    @Test
    public void testSearchPlacesByTerrain() throws NotFoundException {
        String terrain = "plains";
        List<Place_info> places = new ArrayList<>();
        places.add(new Place_info(1L,"Madurai","Historical","plains"));
        when(placeRepo.findAll()).thenReturn(places);
        
        List<Place_info> result = clientService.searchPlacesByTerrain(terrain);
        assertEquals(1, result.size());
        assertEquals("Madurai", result.get(0).getPlace_name());
    	}
	

}