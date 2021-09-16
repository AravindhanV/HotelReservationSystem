package HotelReservationSystem;

public class Hotel {
	private String name;
	private int regularRate;
	private int weekendRate;
	
	public Hotel(String name, int regularRate, int weekendRate) {
		this.name = name;
		this.regularRate = regularRate;
		this.weekendRate = weekendRate;
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
}
