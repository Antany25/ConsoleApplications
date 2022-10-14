package model;

public class DummyValues {
	static LogicalLayer path=new LogicalLayer();
	public static void insertDetails() {
		CustomerDetails custom=new CustomerDetails();
		custom.setName("Antany");
		custom.setAadhaarId(12345678);
		custom.setPassportNo("45FGD665P");
		custom.setPhoneNo(980716253);
		custom.setAddress("Karaikudi");
		path.addCustomerDetails(custom);
		
		
		custom=new CustomerDetails();
		custom.setName("Tom");
		custom.setAadhaarId(87654321);
		custom.setPassportNo("63GFJG56");
		custom.setPhoneNo(918273645);
		custom.setAddress("Chennai");
		path.addCustomerDetails(custom);
		
		FlightDetails account=new FlightDetails();
		account.setFlightName("Indigo");
		account.setFlightNo(2525);
		account.setArrival("Cochin");
		account.setDeparture("Chennai");
		account.setTotalSeats(120);
		account.setAvailableSeats(40);
		account.setFlightCharge(5000);
		path.addFlightDetails(account);
		
		account=new FlightDetails();
		account.setFlightName("AirIndia");
		account.setFlightNo(7273);
		account.setArrival("Delhi");
		account.setDeparture("Coimbatore");
		account.setTotalSeats(150);
		account.setAvailableSeats(30);
		account.setFlightCharge(8000);
		path.addFlightDetails(account);
	}
}
