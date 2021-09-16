/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HotelReservationSystem;

import org.junit.Test;
import static org.junit.Assert.*;

public class HotelReservationSystemTest {
	@Test
	public void addHotel_ValidInput_ListSizeIncreased() {
		HotelReservationSystem system = new HotelReservationSystem();
		int oldSize = system.getHotelList().size();
		system.addHotel("Lakewood", 110,90);
		assertEquals(oldSize+1,system.getHotelList().size());
	}
	
	@Test
	public void findCheapestHotel_ValidInput_CheapestHotel() {
		HotelReservationSystem system = new HotelReservationSystem();
		system.addHotel("Lakewood", 110,90);
		system.addHotel("Bridgewood", 160,50);
		system.addHotel("Ridgewood", 220,150);
		
		Hotel hotel = system.findCheapestHotel("10-09-2020", "11-09-2020");
		assertEquals(hotel.getName(),"Lakewood");
	}
}
