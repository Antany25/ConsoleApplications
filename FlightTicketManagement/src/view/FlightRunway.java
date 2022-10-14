package view;


import java.util.Scanner;

import model.CustomerDetails;
import model.FlightDetails;
import model.LogicalLayer;

public class FlightRunway {
	
	static LogicalLayer path=new LogicalLayer();
	static Scanner scanner=new Scanner(System.in);
	
	public void cancelTicket() {
		System.out.println("Enter the customer id");
		int customerId=scanner.nextInt();
		System.out.println("Enter the Flight id");
		int flightId=scanner.nextInt();
		CustomerDetails custom=path.cancelTickets(customerId,flightId);	
		System.out.println(custom);
	}
	
	public  void showAvailableSeats() {
		System.out.println("Enter the Flight Id to show the available Seats");
		int flightId=scanner.nextInt();
		int seats=path.availableSeats(flightId);
		System.out.println("The Available seats in the Flight:"+flightId+" is "+seats);
	}
	
	public void customerBooking() {
		System.out.println("Enter the customer id");
		int customerId=scanner.nextInt();
		System.out.println("Enter the Flight id");
		int flightId=scanner.nextInt();
		CustomerDetails custom=path.booking(customerId,flightId);
		System.out.println(custom);
	}
	
	public void showCustomerDetails() {
		int customerId=scanner.nextInt();
		CustomerDetails custom=path.getCustomerDetails(customerId);
		System.out.println(custom);
	}
	
	public void showFlightDetails() {
		int flightId=scanner.nextInt();
		FlightDetails account=path.getFlightDetails(flightId);
		System.out.println(account);
	}
}
