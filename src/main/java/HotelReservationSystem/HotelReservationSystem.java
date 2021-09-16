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

	public void addHotel(String name, int regularRate, int weekendRate) {
		hotelList.add(new Hotel(name, regularRate, weekendRate));
	}

	public Hotel findCheapestHotel(String date1, String date2) {
		LocalDate startDate = LocalDate.parse(date1);
		LocalDate endDate = LocalDate.parse(date2);
		int noOfWeekdaysCounter=0;
		int noOfWeekendsCounter=0;
		for(LocalDate dateCounter=startDate; startDate.isBefore(endDate); dateCounter.plusDays(1) ) {
			if(dateCounter.getDayOfWeek()==DayOfWeek.SATURDAY || dateCounter.getDayOfWeek()==DayOfWeek.SUNDAY)
				noOfWeekdaysCounter++;
			else
				noOfWeekendsCounter++;
		}
		final int noOfWeekdays = noOfWeekdaysCounter;
		final int noOfWeekends = noOfWeekendsCounter;
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate) +1;
		Hotel hotel = hotelList.stream().min((h1,h2) -> {
			return (h1.getRegularRate()*noOfWeekdays+h1.getWeekendRate()*noOfWeekends) - (h2.getRegularRate());
		}).orElse(null);
		
		return hotel;
	}
}
