package CarParkingModel;
public class AvailableSpacePojo {
    
	private int floor1;
	private int slot1;
	private int ticketNumber;
	private int availableSpace;
	private boolean chargingPoint;
	private String vehicleType;
	
	public int getFloor1() {
		return floor1;}
	
	public void setFloor1(int floor1) {
		this.floor1 = floor1;}
	
	public int getSlot1() {
		return slot1;}
	
	public void setSlot1(int slot1) {
		this.slot1 = slot1;}
	
	public int getAvailableSpace() {
		return availableSpace;}
	
	public void setAvailableSpace(int availableSpace) {
		this.availableSpace = availableSpace;}
	
	public boolean isChargingPoint() {
		return chargingPoint;}
	
	public void setChargingPoint(boolean chargingPoint) {
		this.chargingPoint = chargingPoint;}
	
	public int getTicketNumber() {
		return ticketNumber;}
	
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;}
	
	public String getVehicleType() {
		return vehicleType;}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;}
	
	@Override
	public String toString() {
		return "AvailableSpacePojo [floor1=" + floor1 + ", slot1=" + slot1 + ", ticketNumber=" + ticketNumber
				+ ", availableSpace=" + availableSpace + ", chargingPoint=" + chargingPoint + ", vehicleType="
				+ vehicleType + "]";}
}
