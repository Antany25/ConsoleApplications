package Banking;

public class AccountDet {
   
	
	private int cusId;
	private int accId;
	private int roleID=12345;
	private String password="admin@12345";
	private boolean status;
	private double balance;
	private String branch;

	private String loanstatus;
	

	public int getCusId() {
		return cusId;
	}
	public void setCusId(int userId) {
		this.cusId = userId;
	}
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoanstatus() {
		return loanstatus;
	}
	public void setLoanstatus(String loanstatus) {
		this.loanstatus = loanstatus;
	}
	@Override
	public String toString() {
		return "AccountDet [cusId=" + cusId + ", accId=" + accId +
				 ", status=" + status + ", balance=" + balance + ", branch=" + branch + ", loanstatus=" + loanstatus
				+ "]";
	}
	


	
	
	
	
	
}