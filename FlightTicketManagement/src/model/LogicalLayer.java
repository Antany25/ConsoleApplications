package model;
import controller.FlightCache;
public class LogicalLayer {
	FlightCache mode=new FlightCache();
	
	public void addCustomerDetails(CustomerDetails custom)
	{
		mode.addCustomerDetail(custom);
	}
	
	public CustomerDetails getCustomerDetails(int cusId)
	{
		return mode.getCustomerDetails(cusId);
	}
	
	public void addFlightDetails(FlightDetails account)
	{
		mode.addFlightDetails(account);
	}
	
	public FlightDetails getFlightDetails(int accId)
	{
		return mode.getFlightDetails(accId);
	}
	
	public CustomerDetails booking(int customerId,int flightId) 
	{
		return mode.bookingProcess(customerId,flightId);
	}
	
	public int availableSeats(int flightId) {
		return mode.showSeats(flightId);
	}
	
	public CustomerDetails cancelTickets(int customerId,int flightId) {
		return mode.cancelProcess(customerId,flightId);
	}
	
}
