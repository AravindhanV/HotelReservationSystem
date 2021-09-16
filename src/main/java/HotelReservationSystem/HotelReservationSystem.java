/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HotelReservationSystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.time.temporal.*;

public class HotelReservationSystem {
	private List<Hotel> hotelList;

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public HotelReservationSystem() {
		this.hotelList = new ArrayList<Hotel>(3);
	}

	public void printHello() {
		System.out.println("Welcome to hotel management");
	}

	public void addHotel(String name, int regularRate, int weekendRate, int rating) {
		hotelList.add(new Hotel(name, regularRate, weekendRate,rating));
	}

	public Hotel findCheapestHotel(String date1, String date2) {
		LocalDate startDate = LocalDate.parse(date1);
		LocalDate endDate = LocalDate.parse(date2);
		int noOfWeekdaysCounter=0;
		int noOfWeekendsCounter=0;
		for(LocalDate dateCounter=startDate; dateCounter.isBefore(endDate); dateCounter = dateCounter.plusDays(1) ) {
			if(dateCounter.getDayOfWeek()==DayOfWeek.SATURDAY || dateCounter.getDayOfWeek()==DayOfWeek.SUNDAY)
				noOfWeekendsCounter++;
			else
				noOfWeekdaysCounter++;
		}
		final int noOfWeekdays = noOfWeekdaysCounter;
		final int noOfWeekends = noOfWeekendsCounter;
		Hotel hotel = hotelList.stream().sorted((h1,h2) -> {
			return h2.getRating() - h1.getRating();
		}).min((h1,h2) -> {
			return (h1.getRegularRate()*noOfWeekdays+h1.getWeekendRate()*noOfWeekends) - (h2.getRegularRate()*noOfWeekdays+h2.getWeekendRate()*noOfWeekends);
		}).orElse(null);
		
		return hotel;
	}
}
