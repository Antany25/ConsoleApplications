package Banking;
import java.time.LocalDate;
import java.time.LocalTime;

public class TransactionPojo {

	
	
	private int accId;
	private int cusId;
	private LocalDate date;
    private LocalTime time;
	private double bal;
	private double withdrawn;
	private String comments;
	private double deposit;
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public double getWithdrawn() {
		return withdrawn;
	}
	public void setWithdrawn(double withdrawn) {
		this.withdrawn = withdrawn;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "accId=" + accId + ", cusId=" + cusId + ", date=" + date + ", time=" + time
				+ ", bal=" + bal + ", withdrawn=" + withdrawn + ", comments=" + comments + ", deposit=" + deposit;
	}
	
	
	
	
	
}