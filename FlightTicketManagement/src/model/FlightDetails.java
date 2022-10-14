package model;

public class FlightDetails {
	private String flightName;
	private int flightNo;
	private String Arrival;
	private String Departure;
	private int flightCharge;
	private int totalSeats;
	private int availableSeats;
	private int flightId;
	private boolean isBooked;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getArrival() {
		return Arrival;
	}
	public void setArrival(String arrival) {
		Arrival = arrival;
	}
	public String getDeparture() {
		return Departure;
	}
	public void setDeparture(String departure) {
		Departure = departure;
	}
	public int getFlightCharge() {
		return flightCharge;
	}
	public void setFlightCharge(int flightCharge) {
		this.flightCharge = flightCharge;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId= flightId;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightName=" + flightName + ", flightNo=" + flightNo + ", Arrival=" + Arrival
				+ ", Departure=" + Departure + ", flightCharge=" + flightCharge + ", totalSeats=" + totalSeats
				+ ", availableSeats=" + availableSeats + ", accountId=" + flightId + ", isBooked=" + isBooked + "]";
	}
	
	
	
	
}
