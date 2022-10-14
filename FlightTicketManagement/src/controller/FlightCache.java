package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.CustomerDetails;
import model.FlightDetails;

public class FlightCache {
	Map<Integer,CustomerDetails> customMap=new HashMap<>();
	Map<Integer,FlightDetails>  accountMap=new HashMap<>();
	Map<Integer,ArrayList<Integer>> listMap=new HashMap<>();
	private int customerId=0;
	private int flightId=0;
	private String password="Pass@123";
	public String addCustomerDetail(CustomerDetails custom) 
	{
			custom.setCustomerId(customerId);
			custom.setPassword(password);
			customMap.put(getCustomerId(), custom);
			System.out.println("Customer Added Successfully ");
			return "Your customer Id : "+customerId;
		    
		}
	public int getCustomerId()
	{
		return ++customerId;
	}
	public CustomerDetails getCustomerDetails(int customerId)
	{
		if(customMap.containsKey(customerId))
		{
			CustomerDetails custom=customMap.get(customerId);
			return custom;
		}
		System.out.println("the customMap in get Customer details are empty ");
		return null;
	}
	public String addFlightDetails(FlightDetails account)
	{
		account.setFlightId(flightId);
		accountMap.put(getFlightId(), account);
		System.out.println("Flight Added Successfully");
		return "Your flightId is " +flightId;
	}
	public int getFlightId()
	{
	   return ++flightId;
	}
	public FlightDetails getFlightDetails(int accountId)
	{
		if(accountMap.containsKey(flightId))
		{
			FlightDetails account=accountMap.get(accountId);
			return account;
		}
		else 
		{
			System.out.println("the the accountMap is empty");
			return null;
		}
	}
	public CustomerDetails bookingProcess(int customerId,int flightId){
		CustomerDetails custom=customMap.get(customerId);
		FlightDetails account=accountMap.get(flightId);
		if(account.getAvailableSeats()>0) {
			account.setBooked(true);
			int seats=account.getAvailableSeats()-1;
			account.setAvailableSeats(seats);
			custom.setisBooked(true);
			customMap.put(flightId,custom);
			accountMap.put(flightId, account);
			return custom;
		}
		else {
			System.out.println("Sorry All Seats are Booked ");
			return null;
		}
	}
	public int showSeats(int flightId) {
		FlightDetails account=accountMap.get(flightId);
		int seats=account.getAvailableSeats();
		return seats;
		
	}
	public CustomerDetails cancelProcess(int customerId,int flightId) {
		CustomerDetails custom=customMap.get(customerId);
		FlightDetails account=accountMap.get(flightId);
		account.setBooked(false);
		int seats=account.getAvailableSeats()+1;
		account.setAvailableSeats(seats);
		custom.setisBooked(false);
		customMap.put(flightId,custom);
		accountMap.put(flightId, account);
		return custom;
		
	}
}
