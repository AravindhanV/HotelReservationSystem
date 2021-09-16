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
		system.addHotel("Lakewood", 110, 90,3);
		assertEquals(oldSize + 1, system.getHotelList().size());
	}

	@Test
	public void findCheapestHotel_ValidInput_CheapestHotel() {
		HotelReservationSystem system = new HotelReservationSystem();
		system.addHotel("Lakewood", 110, 90,3);
		system.addHotel("Bridgewood", 150, 50,4);
		system.addHotel("Ridgewood", 220, 150,5);

		Hotel hotel = system.findCheapestHotel("2020-09-10", "2020-09-11");
		assertEquals(hotel.getName(), "Lakewood");
	}

	@Test
	public void findCheapestHotel_InputWithWeekend_CheapestHotel() {
		HotelReservationSystem system = new HotelReservationSystem();
		system.addHotel("Lakewood", 110, 90,3);
		system.addHotel("Bridgewood", 150, 50,4);
		system.addHotel("Ridgewood", 220, 150,5);

		Hotel hotel = system.findCheapestHotel("2020-09-11", "2020-09-12");
		assertTrue(hotel.getName().matches("(Lakewood|Bridgewood)"));
	}
}
