package HotelReservationSystem;

public class Hotel {
	private String name;
	private int regularWeekdayRate;
	private int regularWeekendRate;
	private int rewardWeekdayRate;
	private int rewardWeekendRate;
	private int rating;
	
	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate,int rewardWeekdayRate, int rewardWeekendRate,int rating) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
		this.rewardWeekdayRate = rewardWeekdayRate;
		this.rewardWeekendRate = rewardWeekendRate;
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

	public int getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	public void setRegularWeekdayRate(int regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	public int getRegularWeekendRate() {
		return regularWeekendRate;
	}

	public void setRegularWeekendRate(int regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}

	public int getRewardWeekdayRate() {
		return rewardWeekdayRate;
	}

	public void setRewardWeekdayRate(int rewardWeekdayRate) {
		this.rewardWeekdayRate = rewardWeekdayRate;
	}

	public int getRewardWeekendRate() {
		return rewardWeekendRate;
	}

	public void setRewardWeekendRate(int rewardWeekendRate) {
		this.rewardWeekendRate = rewardWeekendRate;
	}
}
