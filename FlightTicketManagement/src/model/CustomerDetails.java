package model;

public class CustomerDetails {
	private String name;
	private long aadhaarId;
	private String passportNo;
	private long phoneNo;
	private String address;
	private int customerId;
	private String password;
	private boolean isBooked;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(long aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setisBooked(boolean status) {
		this.isBooked = status;
	}
	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", aadhaarId=" + aadhaarId + ", passportNo=" + passportNo
				+ ", phoneNo=" + phoneNo + ", address=" + address + ", customerId=" + customerId + ", password="
				+ password + ", status=" + isBooked + "]";
	}
	
	
	
}
