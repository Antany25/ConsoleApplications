package CarParkingModel;

public class CustomerPojo {
       
	private int customerId;
	private String vehicleNumber;
	private double amount;
	private String vehicleType;
	private String paymentType;
    private long mobileNumber;
	
	public int getCustomerId() {
		return customerId;}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;}
	
	public String getVehicleNumber() {
		return vehicleNumber;}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;}
	
	public double getAmount() {
		return amount;}
	
	public void setAmount(double amount) {
		this.amount = amount;}
	
	public String getVehicleType() {
		return vehicleType;}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;}
	
	public String getPaymentType() {
		return paymentType;}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;}

	
	public long getMobileNumber() {
		return mobileNumber;}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;}
	
	@Override
	public String toString() {
		return "CustomerPojo [customerId=" + customerId + ", vehicleNumber=" + vehicleNumber + ", amount=" + amount
				+ ", vehicleType=" + vehicleType + ", paymentType=" + paymentType + ", mobileNumber=" + mobileNumber
				+ "]";}
}
