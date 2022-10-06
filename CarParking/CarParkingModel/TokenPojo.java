package CarParkingModel;
public class TokenPojo {
	private int ticketNumber;
	private int floor;
	private int spot;
	private String paymentAtEntry;
	private String vehicleNumber;
	private String vehicleType;
	private String paymentType;
	private double amount;
	private long time;
	private double chargeAmount;
	private int customerId;
	private long mobileNumber;
	
	public int getTicketNumber() {
		return ticketNumber;}
	
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;}
	
	public int getFloor() {
		return floor;}

	public void setFloor(int floor) {
		this.floor = floor;}
	
	public long getMobileNumber() {
		return mobileNumber;}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;}
	
	public int getSpot() {
		return spot;}
	
	public void setSpot(int spot) {
		this.spot = spot;}
	
	public String getPaymentAtEntry() {
		return paymentAtEntry;}
	
	public void setPaymentAtEntry(String paymentAtEntry) {
		this.paymentAtEntry = paymentAtEntry;}
	
	public int getCustomerId() {
		return customerId;}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;}
	
	public String getPaymentType() {
		return paymentType;}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;}
	
	public long getTime() {
		return time;}
	
	public void setTime(long time) {
		this.time = time;}
	
	public double getChargeAmount() {
		return chargeAmount;}
	
	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;}
	
	public double getAmount() {
		return amount;}
	
	public void setAmount(double amount) {
		this.amount = amount;}
	
	public String getVehicleNumber() {
		return vehicleNumber;}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;}
	
	public String getVehicleType() {
		return vehicleType;}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;}
	
	@Override
	public String toString() {
		return "TokenPojo [ticketNumber=" + ticketNumber + ", floor=" + floor + ", spot=" + spot + ", paymentAtEntry="
				+ paymentAtEntry + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType
				+ ", paymentType=" + paymentType + ", amount=" + amount + ", time=" + time + ", chargeAmount="
				+ chargeAmount + ", customerId=" + customerId + "]";}
	
	
}
