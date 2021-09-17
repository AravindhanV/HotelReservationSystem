package HotelReservationSystem;

import java.util.List;

public interface HotelReservationService {
	public List<Hotel> getHotelList();
	public Hotel findBestRatedHotel(String date1, String date2);
	public void addHotel(String name, int regularWeekdayRate, int regularWeekendRate,int rewardWeekdayRate, int rewardWeekendRate, int rating);
	public Hotel findCheapestHotel(String date1, String date2, boolean isReward);
}
