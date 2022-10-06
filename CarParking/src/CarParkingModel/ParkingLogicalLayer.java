package CarParkingModel;
import java.util.Map;

import CarParkingController.ParkingCache;
import CarParkingModel.TokenPojo;
public class ParkingLogicalLayer {
	       static ParkingCache imp=new ParkingCache();
	
	public String getAvailableSpaces(int floor,String vehicleType) throws Exception{
		return imp.messageShown(floor, vehicleType);}
	
	public void floorGenerate(int floor,int space) throws Exception{
		imp.floorSize(floor, space);}
	
	public String carTokenGenerate(TokenPojo custom,int floor,int amountCar,String checkChargeConfirm) throws Exception{
		return imp.addCustomerEntry(custom, floor, amountCar, checkChargeConfirm);}
	
	public String customVehicleSpot(int ticket) throws Exception{
		return imp.vehicleSpots(ticket);}
	
	public String vehicleExits(int ticket,long mobileNumber) throws Exception{
		return  imp.vehicleExits(ticket,mobileNumber);}
	
	public String callExits(int ticket,double amount,long customerId,double returnMoney) throws Exception{
		return imp.callExits(ticket,amount,customerId,returnMoney);}
	
	public String customerIdGenerate(CustomerPojo custom) throws Exception{
		return imp.generateCustomerId(custom);}
	
	public String balanceAdded(long mobileNumber,double amount) throws Exception{
		return imp.addAmountInCustomerAccount(mobileNumber, amount);}
	
	public Map<Long,CustomerPojo> allCustomerId() throws Exception{
		return imp.customerDetails();}
	
	public int amountReturned(long mobileNumber) throws Exception{
		return imp.amountReturnedInCache(mobileNumber);}
	
	public boolean statusMoney(long mobileNumber) throws Exception{
		return imp.statusOfMoney(mobileNumber);}
	
	public String portalAmountAdded(long mobileNumber,String paymentType,double amount) throws Exception{
		return imp.amountAddedInWallet(mobileNumber,paymentType,amount);}
	
	public String portalRegisteredCheck(long mobileNumber) throws Exception{
		return imp.customerPortalChecking(mobileNumber);}
	
	public void checkFloorSize(int floor) throws Exception{
		imp.checkFloor(floor);}
	
	public void checkFloorType(int floor,String type) throws Exception{
		imp.checkFloorAndSpot(floor);}
	
	public void ticketCheck(int ticket) throws Exception{
		imp.tokenCheck(ticket);}
	
	public void insideFloor(int floor) throws Exception{
		imp.floorInside(floor);}
}
