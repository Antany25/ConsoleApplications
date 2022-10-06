package BankingModel;
public class CustomerDet {
	
	
	private int cusId;
	private String customerName;
	private String address;
	private String branch;
	private double balance;
	private int userName=cusId;
	private String password="pass@"+cusId;
	private long mobileNumber;
	private String loanApproval="not applicable";
	
	
	public int getUserName() {
		return userName;
	}
	public void setUserName(int userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/*
	 * public int getAccId() { return accId; } public void setAccId(int accId) {
	 * this.accId = accId; }
	 */
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
	public String getLoanApproval() {
		return loanApproval;
	}
	public void setLoanApproval(String loanApproval) {
		this.loanApproval = loanApproval;
	}
	@Override
	public String toString() {
		return "CustomerDet [cusId=" + cusId + ", customerName=" + customerName + ", address=" + address + ", branch="
				+ branch + ", balance=" + balance + ", userName=" + userName + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", loanApproval=" + loanApproval + "]";
	}

	
	
	
	

	
	
	
	
	

}