package HotelReservationSystem;

public class Hotel {
	private String name;
	private int regularRate;
	private int weekendRate;
	private int rating;
	
	public Hotel(String name, int regularRate, int weekendRate,int rating) {
		this.name = name;
		this.regularRate = regularRate;
		this.weekendRate = weekendRate;
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularRate() {
		return regularRate;
	}

	public void setRegularRate(int regularRate) {
		this.regularRate = regularRate;
	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}
}
